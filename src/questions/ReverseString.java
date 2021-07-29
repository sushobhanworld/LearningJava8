package questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static String reverseString(String text){
        char[] chars= text.toCharArray();
        return IntStream.iterate(chars.length - 1, i -> i >= 0, i -> i - 1)
                .mapToObj(i -> String.valueOf(chars[i])).collect(Collectors.joining());
    }

    private static String reverseStringOriginal(String text){
        String[] s= text.split("");
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
            stringBuilder.append(s[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("sushobhan"));
        System.out.println(reverseStringOriginal("sushobhan"));
    }
}
