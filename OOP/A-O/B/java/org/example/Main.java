package org.example;

import java.util.Scanner;


class DataReader {
    private int x;
    private long y;
    private char c;
    private float f;
    private double d;

    public void readData() {
        Scanner scanner = new Scanner(System.in);

        // قراءة الأنواع المختلفة
        this.x = scanner.nextInt();
        this.y = scanner.nextLong();
        this.c = scanner.next().charAt(0);
        this.f = scanner.nextFloat();
        this.d = scanner.nextDouble();
    }

    public void printData() {
        System.out.println("Integer: " + x);
        System.out.println("Long long: " + y);
        System.out.println("Character: " + c);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
    }
}


public class Main {
    public static void main(String[] args) {

        DataReader dataReader = new DataReader();

        dataReader.readData();
        dataReader.printData();
    }
}