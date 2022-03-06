package com.company;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).filter(i -> i%2 != 0).forEachOrdered(System.out::println);
    }
}
