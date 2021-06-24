package questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOccurrences {
    public static void countOccurrences(String text){
        String[] s=text.split(" ");
        Map<String, Integer> map= new HashMap<>();
        for (String value : s) {
            if (map.containsKey(value))
                map.put(value, map.get(value) + 1);
            else
                map.put(value, 1);
        }
        System.out.println(map);
    }

    public static Map<String, Long> countOccurrencesUsingJava8(String text){
        String[] sList= text.split(" ");
        return IntStream.iterate(0, i->i<sList.length,i->i+1)
                .mapToObj(m->String.valueOf(sList[m]))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
    }

    public static Map<String, Long> countOccurrencesForCharacterUsingJava8(String text){
        char[] chars= text.toCharArray();
        return IntStream.iterate(0, i->i<chars.length,i->i+1)
                .mapToObj(m->String.valueOf(chars[m]))
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
    }

//    public static Map<String, Long> iterate(String text){
//        return Arrays.stream(text.split(" "))
//                .mapToObj(m -> (String)m)
//                .collect(Collectors.groupingBy(c ->c, Collectors.counting()));
//               // .forEach(System.out::println);
//    }

    public static void main(String[] args) {
        countOccurrences("my name is java sushobhan and java is sushobhan subject");
        System.out.println(countOccurrencesUsingJava8("my name is java sushobhan and java is sushobhan subject"));
        System.out.println(countOccurrencesForCharacterUsingJava8("sushobhan"));
        //System.out.println(iterate("sushobhan"));
    }
}
