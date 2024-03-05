package com.example.lesson1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lesson1 {

    
    public static void main(String[] args) {
        Function<Integer, Integer> ageDoubled = (age) -> age * 2;

       System.out.println(ageDoubled.apply(5)); // 10

        InnerLesson1 innerLesson1 = (c) -> "THREE" + c;

        System.out.println(innerLesson1.agePrint(5)); // THREE5



// Bifunctions


        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(5, 10)); // 15


        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5, 10));

        BiFunction<Integer, Integer, Boolean> isAbiggerThanB = (a, b) -> a > b;
        System.out.println(isAbiggerThanB.apply(50, 10));

        
    }


}



/**
 * InnerLesson1
 */
 interface InnerLesson1 {

    String agePrint(Integer age);
    
}