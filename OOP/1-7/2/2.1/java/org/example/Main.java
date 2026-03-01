package org.example;
// 2.1
class Player {
    private int number;
    private String name;

    public Player(int number, String name) {
        if (number > 0 && name.length() > 5) {
            this.number = number;
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid number or name");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void printPlayerInfo() {
        System.out.println("Player Number: " + number);
        System.out.println("Player Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player(7, "Michael Jordan");
        player.printPlayerInfo();
    }
}