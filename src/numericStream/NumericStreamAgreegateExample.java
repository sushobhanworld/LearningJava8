package numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAgreegateExample
{
    public static void main(String[] args) {
        System.out.println("Sum is :"+IntStream.rangeClosed(1,50)
                .sum());
        OptionalInt optionalInteger= IntStream.rangeClosed(1,50).max();
        System.out.println(optionalInteger.isPresent() ? optionalInteger.getAsInt() : 0);

        OptionalInt optionalIntegerZero= IntStream.rangeClosed(0,0).max();
        System.out.println("Use case for range is zero and zero count is :"+IntStream.rangeClosed(0,0).count());
        System.out.println(optionalIntegerZero.isPresent() ? optionalIntegerZero.getAsInt() : 0);

        OptionalLong optionalLong= LongStream.rangeClosed(50,100).min();
        System.out.println("Optional long min :"+(optionalLong.isPresent() ? optionalLong.getAsLong() : 0));

        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println("Average is :"+(average.isPresent() ? average.getAsDouble() : 0));
    }
}
