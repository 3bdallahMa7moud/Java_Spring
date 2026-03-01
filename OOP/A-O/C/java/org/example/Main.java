package org.example;

import java.util.Scanner;

class SimpleCalculator {
    private int x;
    private int y;

    public SimpleCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printResults() {
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        SimpleCalculator calculator = new SimpleCalculator(x, y);
        calculator.printResults();

        scanner.close();
    }
}