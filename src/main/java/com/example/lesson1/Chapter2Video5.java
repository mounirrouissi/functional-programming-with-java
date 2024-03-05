package com.example.lesson1;

import java.util.function.BiFunction;

public class Chapter2Video5 {
    protected static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }

        public static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }

    public static void main(String[] args) {
        MyMath2 myMath2 =(a,b) -> a+b;
        System.out.println(myMath2.sum(5, 10));
       System.out.println(MyMath.combine2And3(MyMath::add));
       System.out.println(MyMath.combine2And3(MyMath::subtract));
       System.out.println(MyMath.combine2And3((x,e) -> 2+3 ));
    }
}


/**
 * InnerChapter2Video5
 */
 interface MyMath2 {

    Integer sum(Integer a, Integer b);
}