package numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream= IntStream.range(1,50);
        System.out.println("Range count :"+intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\n Range closed :"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\n Range closed long stream :"+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));
    }
}
