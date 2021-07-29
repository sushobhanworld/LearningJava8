package TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {
    public static final int LINE_LENGTH=5;

    @Test
    public void lineShouldWrapIfOverLineLength(){
        String result = WordWrap.wrap("The Sleepy",LINE_LENGTH);
        assertEquals("The S\nleepy", result);
    }

    @Test
    public void lineShouldNotWrap(){
        String result = WordWrap.wrap("The",LINE_LENGTH);
        assertEquals("The", result);
    }
}
