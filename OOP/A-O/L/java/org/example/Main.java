package org.example;

import java.util.Scanner;

class Person {
    private final String secondName;

    public Person(String firstName, String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }
}

class BrothersChecker {
    private final Person person1;
    private final Person person2;

    public BrothersChecker(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public void checkIfBrothers() {
        if (person1.getSecondName().equals(person2.getSecondName())) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName1 = scanner.next();
        String secondName1 = scanner.next();
        String firstName2 = scanner.next();
        String secondName2 = scanner.next();

        Person person1 = new Person(firstName1, secondName1);
        Person person2 = new Person(firstName2, secondName2);

        BrothersChecker checker = new BrothersChecker(person1, person2);
        checker.checkIfBrothers();

        scanner.close();
    }
}