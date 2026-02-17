package org.example.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Welcome_for_you_with_Conditions checker = new Welcome_for_you_with_Conditions(a, b);

        if (checker.isAGreaterOrEqual()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
