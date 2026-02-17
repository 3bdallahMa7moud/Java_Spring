package org.example.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        Difference calculator =
                new Difference(a, b, c, d);

        System.out.println("Difference = " + calculator.calculate());

        scanner.close();
    }
}
