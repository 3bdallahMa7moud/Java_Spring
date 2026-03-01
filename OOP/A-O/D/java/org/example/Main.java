package org.example;

import java.util.Scanner;

class Calculator {
    private int a;
    private int b;
    private int c;
    private int d;

    public Calculator(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void calculateDifference() {
        int result = (a * b) - (c * d);
        System.out.println("Difference = " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        Calculator calculator = new Calculator(a, b, c, d);
        calculator.calculateDifference();

        scanner.close();
    }
}