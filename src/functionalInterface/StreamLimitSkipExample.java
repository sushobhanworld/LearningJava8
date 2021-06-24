package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample
{
    public static Optional<Integer> limitResult(List<Integer> integerList)
    {
        return integerList.stream()
                .limit(3) //6,7,8
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skipResult(List<Integer> integerList)
    {
        return integerList.stream()
                .skip(3)  //9,10
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        if(limitResult(integerList).isPresent())
        {
            System.out.println("Limit example :"+limitResult(integerList).get());
        }
        else
        {
            System.out.println("No input is passed");
        }
        if(skipResult(integerList).isPresent())
        {
            System.out.println("Skip example :"+skipResult(integerList).get());
        }
        else
        {
            System.out.println("No input is passed");
        }
    }
}
