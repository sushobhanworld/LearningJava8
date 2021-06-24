package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenericIterateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("adan", "dan", "julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream<Integer> result = Stream.generate(integerSupplier).limit(10);
        result.forEach(System.out::println);
    }
}
