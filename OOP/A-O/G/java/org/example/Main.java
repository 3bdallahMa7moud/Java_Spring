package org.example;

import java.util.Scanner;

class SummationCalculator {
    private long n;

    public SummationCalculator(long n) {
        this.n = n;
    }

    public void calculateSummation() {
        long sum = n * (n + 1) / 2;
        System.out.println(sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        SummationCalculator summationCalculator = new SummationCalculator(n);
        summationCalculator.calculateSummation();

        scanner.close();
    }
}