package com.example.lesson1;

import java.util.function.Function;

public class Lesson1 {

    
    public static void main(String[] args) {
        Function<Integer, Integer> ageDoubled = (age) -> age * 2;

       System.out.println(ageDoubled.apply(5)); // 10

        InnerLesson1 innerLesson1 = (c) -> "THREE" + c;

        System.out.println(innerLesson1.agePrint(5)); // THREE5
    }


}



/**
 * InnerLesson1
 */
 interface InnerLesson1 {

    String agePrint(Integer age);
    
}