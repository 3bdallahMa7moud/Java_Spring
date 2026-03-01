package org.example;

import java.util.Scanner;

class MultiplesChecker {
    private int a;
    private int b;

    public MultiplesChecker(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void checkMultiples() {
        if (a % b == 0 || b % a == 0) {
            System.out.println("Multiples");
        } else {
            System.out.println("No Multiples");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        MultiplesChecker multiplesChecker = new MultiplesChecker(a, b);
        multiplesChecker.checkMultiples();

        scanner.close();
    }
}