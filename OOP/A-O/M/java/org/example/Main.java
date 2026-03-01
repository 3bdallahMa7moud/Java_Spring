package org.example;

import java.util.Scanner;

class CharacterTypeChecker {
    private char x;

    public CharacterTypeChecker(char x) {
        this.x = x;
    }

    public void checkCharacterType() {
        if (Character.isDigit(x)) {
            System.out.println("IS DIGIT");
        } else if (Character.isAlphabetic(x)) {
            System.out.println("ALPHA");
            if (Character.isUpperCase(x)) {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x = scanner.next().charAt(0);

        CharacterTypeChecker checker = new CharacterTypeChecker(x);
        checker.checkCharacterType();

        scanner.close();
    }
}