package questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterPattern {
    public static void buildPattern(String text){
        char[] chars=text.toCharArray();
        IntStream.iterate(0, i->i<chars.length, i->i+1)
                .mapToObj(m->String.valueOf(chars[m]));

    }

    private void buildSequence(String text, int index){
        char[] chars=text.toCharArray();
        IntStream.iterate(0, i->i<text.length(),i->i+1)
                .mapToObj(i -> i==0 ? String.valueOf(chars[i]).toUpperCase() : String.valueOf(chars[i]).toLowerCase())
                .collect(Collectors.joining());
    }
}
