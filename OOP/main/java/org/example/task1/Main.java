package org.example.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Simple_Calculator calculator = new Simple_Calculator(x, y);

        System.out.println(x + " + " + y + " = " + calculator.sum());
        System.out.println(x + " * " + y + " = " + calculator.multiply());
        System.out.println(x + " - " + y + " = " + calculator.subtract());

        scanner.close();
    }
}
