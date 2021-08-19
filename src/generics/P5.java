package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5 {
    public static void main(String[] args) {
        List<String> source= Arrays.asList("Adam","Ana","Kevin");
        List<String> destination= new ArrayList<>();
        copyExample(source,destination);
        System.out.println(destination);
    }

    private static <T> void copyExample(List<? extends T>source, List<? super T>destination){
        // reading the source list
        source.stream()
                .forEach(d->destination.add(d));
    }
}
