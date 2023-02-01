package org.example.functional;
import java.util.List;
//Program to Print all numbers using Stream

public class Ex_01_PrintNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(123,435,356,23,2,1,4,6,8768,10);
        printAllNumbers(numbers);
    }
    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
}
