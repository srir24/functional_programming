package org.example.functional;

import java.util.List;
//Program to Print Even and odd number using Filter
public class Ex_03_PrintEvenOddNumberList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(123,435,356,23,2,1,4,6,8768,10);
        System.out.println("All even numbers from given list");
        printAllEvenNumbers(numbers);
        System.out.println("All odd numbers from given list");
        printAllOddNumbers(numbers);

    }
    private static void printAllEvenNumbers(List<Integer> numbers) {
       // numbers.stream().forEach(System.out::println);
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
    private static void printAllOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }
}
