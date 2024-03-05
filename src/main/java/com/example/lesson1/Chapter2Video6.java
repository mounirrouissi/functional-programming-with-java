package com.example.lesson1;

import java.util.function.Function;

public class Chapter2Video6 {

    public class Math{
  
        public static Function<Integer,Integer> intMultiplier(Integer y){
            return (x) -> x * y;
        }

    }
   public static void main(String[] args) {
    Function<Integer,Function<Integer,Integer>> ageDoubled = (x) ->  (y) -> y * x;


    Function<Integer,Integer> ageDoubled2 = ageDoubled.apply(4);


    System.out.println(ageDoubled2.apply(5));

    // Function<Integer,Integer> twoMultiplier = Math.intMultiplier(2);
    

    // System.out.println(twoMultiplier.apply(5));



}
}