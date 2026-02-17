package org.example.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Age_in_Days converter = new Age_in_Days(n);

        System.out.println(converter.getYears() + " years");
        System.out.println(converter.getMonths() + " months");
        System.out.println(converter.getDays() + " days");

        scanner.close();
    }
}
