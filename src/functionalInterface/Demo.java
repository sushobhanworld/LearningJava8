package functionalInterface;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args) throws IOException{
        List<String> subjects= Arrays.asList("Java","Perl","Java","C++","Perl","C","C++","Ruby");
        System.out.println(subjects.stream()
                //.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
                .collect(Collectors.groupingBy(String::toString, Collectors.counting())));
    }
}
