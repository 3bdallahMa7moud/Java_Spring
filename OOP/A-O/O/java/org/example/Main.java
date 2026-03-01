package org.example;

import java.util.Scanner;

class Calculator {
    private int a;
    private int b;
    private String operator;

    public Calculator(int a, int b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public void calculateAndPrintResult() {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = (double) a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();

        Calculator calculator = new Calculator(a, b, operator);
        calculator.calculateAndPrintResult();

        scanner.close();
    }
}