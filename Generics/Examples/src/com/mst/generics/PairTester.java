package com.mst.generics;

public class PairTester {
    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<>("SimSim", 20);
        System.out.println(stringIntegerPair);
        Pair<Character, Long> charLongPair = Pair.createPair('A', 123L);
        System.out.println(charLongPair);
    }
}
