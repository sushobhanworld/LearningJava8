package questions;

import java.util.*;

public class FindSecondLargestValueInArray {
    public static int getSecondLargestValue(Integer[] a) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int index : a) {
            if (index > highest) {
                secondHighest = highest;
                highest = index;
            } else if (index > secondHighest) {
                secondHighest = index;
            }
        }
        //return highest;
        return secondHighest;
    }

    public static Integer FindLargestValueInArrayUsingJava8(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        Optional<Integer> max = integerList.stream()
                .reduce((m, n) -> m > n ? m : n);
        return max.orElse(null);
    }

    public static Integer FindLargestValueInArrayUsingIntegerMaxJava8(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        Optional<Integer> max = integerList.stream()
                .reduce(Integer::max);
        return max.orElse(null);
    }

    public static void FindAllStatisticsInArrayUsingIntegerMaxJava8(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        IntSummaryStatistics intSummaryStatistics = integerList.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Max :" + intSummaryStatistics.getMax());
        System.out.println("Average :" + intSummaryStatistics.getAverage());
        System.out.println("Min :" + intSummaryStatistics.getMin());
    }

    public static Optional<Integer> FindSecondLargestValueInArrayUsingJava8Comparator(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).findFirst();
    }

    public static Optional<Integer> FindSecondLargestValueInArrayUsingJava8(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    public static Optional<Integer> FindThirdLargestValueInArrayUsingJava8(Integer[] a) {
        List<Integer> integerList = Arrays.asList(a);
        return integerList.stream()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst();
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargestValue(new Integer[]{10, 5, 12, 20}));
        System.out.println(FindLargestValueInArrayUsingIntegerMaxJava8(new Integer[]{10, 5, 12, 20}));
        System.out.println(FindLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}));
        System.out.println(FindSecondLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}).get());
        System.out.println(FindThirdLargestValueInArrayUsingJava8(new Integer[]{10, 5, 12, 20}).get());
        System.out.println(FindSecondLargestValueInArrayUsingJava8Comparator(new Integer[]{10, 5, 12, 20}).get());
        FindAllStatisticsInArrayUsingIntegerMaxJava8(new Integer[]{10, 5, 12, 20});
    }
}
