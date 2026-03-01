package org.example;

import java.util.Scanner;

class ConditionChecker {
    private int a;
    private int b;

    public ConditionChecker(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void checkCondition() {
        if (a >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ConditionChecker checker = new ConditionChecker(a, b);
        checker.checkCondition();

        scanner.close();
    }
}