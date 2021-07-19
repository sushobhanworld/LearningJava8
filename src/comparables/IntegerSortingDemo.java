package comparables;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSortingDemo {
    public static void main(String[] args) {
        List<Integer> arrayList= Arrays.asList(3,7,5,1,45,6);
        arrayList.forEach(System.out::println);
        System.out.println("\n------------------------------");
        arrayList.stream().sorted().collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
