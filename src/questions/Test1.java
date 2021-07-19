package questions;

import java.util.*;

public class Test1 {
    public static void changeValue(List<Map<String, Integer>>object, int index, String key, int newValue){


                object.get(index).replace(key, object.get(index).get(key) + newValue);
       // object.get(2).replace(key, newValue);

        object.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Map<String, Integer>> mapList= new ArrayList<>();
        Map<String, Integer> map1= new LinkedHashMap<>();
        map1.put("Key1", 1);
        map1.put("Key2", 2);
        mapList.add(map1);
        Map<String, Integer> map2= new HashMap<>();
        map2.put("Key3", 3);
        map2.put("Key4",4);
        mapList.add(map2);
        Map<String, Integer> map3= new HashMap<>();
        map3.put("Key4", 4);
        map3.put("Key5",5);
        mapList.add(map3);
        mapList.forEach(System.out::println);
        System.out.println("----------------------------------");
        changeValue(mapList, 2, "Key4", 40);
    }
}
