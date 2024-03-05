package com.example.lesson1;

import java.util.function.Function;

public class Chapter2Video6 {
   public static void main(String[] args) {
    Function<Integer,Function<Integer,Integer>> ageDoubled = (x) ->  (y) -> y * x;


    Function<Integer,Integer> ageDoubled2 = ageDoubled.apply(4).andThen(t -> t * 2);


    System.out.println(ageDoubled2.apply(5));
   }



}
