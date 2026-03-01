package org.example;

import java.util.Scanner;

class MinMaxCalculator {
    private int a;
    private int b;
    private int c;

    public MinMaxCalculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateAndPrintMinMax() {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        System.out.println(min + " " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        MinMaxCalculator calculator = new MinMaxCalculator(a, b, c);
        calculator.calculateAndPrintMinMax();

        scanner.close();
    }
}