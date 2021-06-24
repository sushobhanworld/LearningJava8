package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample
{
    public static int findMaxValue(List<Integer>integerList)
    {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                .reduce(0, (x,y)-> x>y ?x:y);//x value holds the max value in every iteration
    }

    public static Optional<Integer> findMaxValueWithoutIndent(List<Integer>integerList)
    {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                .reduce((x,y)-> x>y ?x:y);//x value holds the max value in every iteration
    }

    public static Optional<Integer> findMinValue(List<Integer>integerList)
    {
        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                .reduce((x,y)-> x<y ?x:y);//x value holds the max value in every iteration
    }
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(integerList));
        if(findMaxValueWithoutIndent(integerList).isPresent())
        {
            System.out.println(findMaxValueWithoutIndent(integerList).get());
        }
        if(findMinValue(integerList).isPresent())
        {
            System.out.println(findMinValue(integerList).get());
        }
    }
}
