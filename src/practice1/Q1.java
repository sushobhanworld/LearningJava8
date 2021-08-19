package practice1;

import java.util.Arrays;
import java.util.List;

public class Q1 {

    static int sumOfOddNumbers(List<Integer> integerList){
        return integerList.stream()
                .filter(number -> number%2 !=0)
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(sumOfOddNumbers(Arrays.asList(1,3,4,6,2,7)));
    }
}
