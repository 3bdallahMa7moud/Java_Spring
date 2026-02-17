package org.example.task3;

public class Summation_from_1_to_N {

    private long n;

    public  Summation_from_1_to_N (long n) {
        this.n = n;
    }

    public long calculate() {
        return n * (n + 1) / 2;
    }
}
