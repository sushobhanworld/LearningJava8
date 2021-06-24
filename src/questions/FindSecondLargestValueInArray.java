package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestValueInArray {
    public static int getSecondLargestValue(Integer[] a){
        int highest= Integer.MIN_VALUE;
        int secondHighest= Integer.MIN_VALUE;

        for(int index:a){
            if(index>highest){
                secondHighest=highest;
                highest=index;
            }
            else if(index>secondHighest){
                secondHighest=index;
            }
        }
        //return highest;
        return secondHighest;
    }

    public static Integer FindLargestValueInArrayUsingJava8(Integer[] a){
        List<Integer> integerList= Arrays.asList(a);
        Optional<Integer> max = integerList.stream()
                .reduce((m, n) -> m > n ? m : n);
        Integer value = max.get();
        return value;
    }

    public static Integer FindLargestValueInArrayUsingIntegerMaxJava8(Integer[] a){
        List<Integer> integerList= Arrays.asList(a);
        Optional<Integer> max = integerList.stream()
                .reduce(Integer::max);
        Integer value = max.get();
        return value;
    }

    public static Optional<Integer> FindSecondLargestValueInArrayUsingJava8Comparator(Integer[] a){
        List<Integer> integerList= Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).findFirst();
    }

    public static Optional<Integer> FindSecondLargestValueInArrayUsingJava8(Integer[] a){
        List<Integer> integerList= Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    public static Optional<Integer> FindThirdLargestValueInArrayUsingJava8(Integer[] a){
        List<Integer> integerList= Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst();
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargestValue(new Integer[]{10, 5, 12, 20}));
        System.out.println(FindLargestValueInArrayUsingIntegerMaxJava8(new Integer[]{10, 5, 12, 20})
        );
        System.out.println(FindLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}));
        System.out.println(FindSecondLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}).get());
        System.out.println(FindThirdLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}).get());
        System.out.println(FindSecondLargestValueInArrayUsingJava8Comparator(new Integer[]{10, 5, 12, 20}).get());
    }
}
