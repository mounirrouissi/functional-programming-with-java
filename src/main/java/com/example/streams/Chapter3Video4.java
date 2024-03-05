package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Chapter3Video4 {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        Map<Integer, List<String>> wordLengthMap = words
                .stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.groupingBy(String::length));
                // .collect(Collectors.groupingBy(
                //         (word) -> word.length()
                // ));

        System.out.println(wordLengthMap);
    }
}
