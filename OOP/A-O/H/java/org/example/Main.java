package org.example;

import java.util.Scanner;

class DivisionCalculator {
    private double a;
    private double b;

    public DivisionCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void calculateAndPrintResults() {
        double result = a / b;

        System.out.println("floor " + a + " / " + b + " = " + Math.floor(result));
        System.out.println("ceil " + a + " / " + b + " = " + Math.ceil(result));
        System.out.println("round " + a + " / " + b + " = " + Math.round(result));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        DivisionCalculator calculator = new DivisionCalculator(a, b);
        calculator.calculateAndPrintResults();

        scanner.close();
    }
}