package com.mst.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncioanlInterfaceExample {

    public static void main(String[] args) {
        // Supplier<T>: Supplies an integer value
        Supplier<Integer> supplier = () -> 10;
        Integer suppliedValue = supplier.get();
        System.out.println("Supplied Value: " + suppliedValue); // Output: Supplied Value: 10

        // Consumer<T>: Consumes an integer value and prints it
        Consumer<Integer> consumer = value -> System.out.println("Consumed Value: " + value);
        consumer.accept(suppliedValue); // Output: Consumed Value: 10

        // Predicate<T>: Checks if an integer is greater than 5
        Predicate<Integer> isGreaterThanFive = value -> value > 5;
        boolean testResult = isGreaterThanFive.test(suppliedValue);
        System.out.println("Is Greater Than Five: " + testResult); // Output: Is Greater Than Five: true

        // Function<T, R>: Converts an integer to a string
        Function<Integer, String> intToString = value -> "Converted to String: " + value;
        String resultString = intToString.apply(suppliedValue);
        System.out.println(resultString); // Output: Converted to String: 10
    }
}
