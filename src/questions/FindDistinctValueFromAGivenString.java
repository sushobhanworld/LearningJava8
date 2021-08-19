package questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDistinctValueFromAGivenString {
    public static void findDistinctValue(String text){
        char[] chars= text.toCharArray();
        Map<Character, Integer> map= new HashMap<>();
        for(char c: chars) {
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        System.out.println(map);
    }

    public static void findDistinctValueFromHashSet(String text){
        char[] chars = text.toCharArray();
        Set<Character> characterSet= new HashSet<>();
        for(char c: chars){
            if(!characterSet.contains(c))
                characterSet.add(c);
        }
        characterSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findDistinctValue("sushobhan");
        findDistinctValueFromHashSet("anjana");
    }
}
