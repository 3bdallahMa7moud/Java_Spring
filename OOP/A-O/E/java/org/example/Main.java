package org.example;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        final double PI = 3.141592653;
        return PI * radius * radius;
    }

    public void printArea() {
        System.out.printf("%.9f\n", calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.printArea();

        scanner.close();
    }
}