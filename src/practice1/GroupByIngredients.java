package practice1;

import java.util.*;

public class GroupByIngredients {
    public static TreeMap<String, List<String>> groupingDishes(String[][] dishes){
        TreeMap<String, List<String>> map= new TreeMap<>();
        for (String[] arr : dishes) {
            for (int j = 1; j < arr.length; j++) {
                List<String> list;
                if (!map.containsKey(arr[j])) {
                    list = new LinkedList<>();
                } else {
                    list = map.get(arr[j]);
                }
                list.add(arr[0]);
                map.put(arr[j], list);
            }
        }
//        Map<String, List<String>> map2= new TreeMap<>();
//        for(String key: map.keySet()){
//            if(map.get(key).size()>=2){
//                Collections.sort(map.get(key));
//                map2.put(key, map.get(key));
//            }
//        }
//        String[][] result= new String[(map.size())][];
//        List<String> l= new LinkedList<>();
        return map;
    }

    public static void usingJav8(String[][] dishes){

    }

    public static void main(String[] args) {
        String[][] dishes= {{"Salad","Tomato","Cucumber","Salad","Sauce"},
                {"Pizza","Tomato","Sausage","Sauce","Dough"},
        {"Quesadilla","Chicken","Cheese","Sauce"},
        {"Sandwich","Salad","Bread","Tomato","Cheese"}};
        System.out.println(groupingDishes(dishes));
    }
}
