package com.example.a2lab;

public class TextCounter {
    static String getCharCount(String text){
        return String.valueOf(text.length());
    }

    static String getWordCount(String text){
        String[] wordArray = text.trim().split("[\\s]+|[, ]+|[. ]+");
        return String.valueOf(wordArray.length);
    }
}
