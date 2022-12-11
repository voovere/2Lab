package com.example.a2lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextCounterClassUnitTest {
    @Test
    public void Given_String_With_A_Lot_Of_Spaces_To_getCharCount(){
        final String givenString = "               ";

        final int expectedResult = 0;
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(String.valueOf(expectedResult), actualResult);
    }

    @Test
    public void Given_String_With_Symbols_And_MultipleSpaces_To_getCharCount(){
        final String givenString = "a   ab s  ";

        final int expectedResult = 10;
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(String.valueOf(expectedResult), actualResult);
    }

    @Test
    public void Given_String_With_A_Lot_Of_Spaces_To_getWordCount(){
        final String givenString = "               ";

        final int expectedResult = 0;
        final String actualResult = TextCounter.getWordCount(givenString);

        assertEquals(String.valueOf(expectedResult), actualResult);
    }

    @Test
    public void Given_String_With_Words_Dots_And_Spaces_To_getWordCount(){
        final String givenString = "aaa.asd asd. asdasd";

        final int expectedResult = 4;
        final String actualResult = TextCounter.getWordCount(givenString);

        assertEquals(String.valueOf(expectedResult), actualResult);
    }
}