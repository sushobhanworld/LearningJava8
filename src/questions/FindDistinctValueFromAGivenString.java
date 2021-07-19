package questions;

import java.util.HashMap;
import java.util.Map;

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

    public static void main(String[] args) {
        findDistinctValue("sushobhan");
    }
}
