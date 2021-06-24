package numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample
{
    public static List<Integer> mapToObj()
    {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i)->{
                    return new Integer(i); //in place of Integer we can use any custom object which takes integer as input
                })
                .collect(Collectors.toList());
    }

    public static long mapToLong()
    {
        return IntStream.rangeClosed(1,5)
                .mapToLong(i->i) //converts IntStream to LongStream
                .sum();
    }

    public static double mapToDouble()
    {
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i->i) //converts IntStream to DoubleStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Map to Object :"+mapToObj());
        System.out.println("Sum :"+mapToLong());
        System.out.println("Map tp Double :"+mapToLong());
    }
}
