package org.example;

import java.util.Scanner;

class DigitSummation {
    private long n;
    private long m;

    public DigitSummation(long n, long m) {
        this.n = n;
        this.m = m;
    }

    public void calculateSumOfLastDigits() {
        int lastDigitN = (int) (n % 10);
        int lastDigitM = (int) (m % 10);
        int sum = lastDigitN + lastDigitM;
        System.out.println(sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();

        DigitSummation digitSummation = new DigitSummation(n, m);
        digitSummation.calculateSumOfLastDigits();

        scanner.close();
    }
}