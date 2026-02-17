package org.example.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

         Summation_from_1_to_N  calculator =
                new  Summation_from_1_to_N (n);

        System.out.println(calculator.calculate());

        scanner.close();
    }
}
