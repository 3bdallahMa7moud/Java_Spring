package org.example;

import java.util.Scanner;

class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public void printGreeting() {
        System.out.println("Hello, " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Greeting greeting = new Greeting(name);
        greeting.printGreeting();

        scanner.close();
    }
}