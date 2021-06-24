package questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static String reverseString(String text){
        char[] chars= text.toCharArray();
        return IntStream.iterate(chars.length - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(i -> String.valueOf(chars[i])).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sushobhan"));
    }
}
