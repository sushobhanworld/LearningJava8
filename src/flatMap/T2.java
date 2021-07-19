package flatMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class T2 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        System.out.println(firstUpperCaseThenSort(topNames2015));
        System.out.println(countStartsWithA(topNames2015));
    }
    private static List<String> firstUpperCaseThenSort(List<String> list){
        return list.stream()
                .map(l ->l.substring(0,1).toUpperCase()+l.substring(1))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    private static long countStartsWithA(List<String> list){
        return list.stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .peek(System.out::println) //nothing happens
                .filter(name ->name.startsWith("A"))
                .count();
    }
}
