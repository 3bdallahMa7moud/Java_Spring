package org.example;

import java.util.Scanner;

class CharConverter {
    private char x;

    public CharConverter(char x) {
        this.x = x;
    }

    public void convertChar() {
        if (Character.isLowerCase(x)) {
            System.out.println(Character.toUpperCase(x));
        } else if (Character.isUpperCase(x)) {
            System.out.println(Character.toLowerCase(x));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x = scanner.next().charAt(0);

        CharConverter converter = new CharConverter(x);
        converter.convertChar();

        scanner.close();
    }
}