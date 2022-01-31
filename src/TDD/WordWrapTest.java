package TDD;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
