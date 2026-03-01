package org.example;

import java.util.Scanner;

public class Main {

    public static class Player {
        private int id;
        private String name;
        private int number;

        public Player(int id, String name, int number) {
            if (id > 0) {
                this.id = id;
            } else {
                throw new IllegalArgumentException("ID must be greater than 0");
            }
            this.name = name;
            this.number = number;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getNumber() {
            return number;
        }

        public void printData() {
            System.out.println("Player ID: " + id);
            System.out.println("Player Name: " + name);
            System.out.println("Player Number: " + number);
        }
    }

    public static class ClupFc extends Player {
        private String Fcode;

        public ClupFc(int id, String name, int number, String Fcode) {
            super(id, name, number);
            this.Fcode = Fcode;
        }

        public String getFcode() {
            return Fcode;
        }

        public void setFcode(String Fcode) {
            this.Fcode = Fcode;
        }

        @Override
        public void printData() {
            super.printData();
            System.out.println("Football Club Code: " + Fcode);
        }
    }

    public static class ClupRel extends Player {
        private String Rcode;

        public ClupRel(int id, String name, int number, String Rcode) {
            super(id, name, number);
            this.Rcode = Rcode;
        }

        public String getRcode() {
            return Rcode;
        }

        public void setRcode(String Rcode) {
            this.Rcode = Rcode;
        }

        @Override
        public void printData() {
            super.printData();
            System.out.println("Religion Club Code: " + Rcode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Football Club Player details:");
        System.out.print("ID: ");
        int fcId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String fcName = scanner.nextLine();
        System.out.print("Number: ");
        int fcNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Football Club Code (Fcode): ");
        String Fcode = scanner.nextLine();

        ClupFc fcPlayer = new ClupFc(fcId, fcName, fcNumber, Fcode);

        System.out.println("\nEnter Religion Club Player details:");
        System.out.print("ID: ");
        int relId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String relName = scanner.nextLine();
        System.out.print("Number: ");
        int relNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Religion Club Code (Rcode): ");
        String Rcode = scanner.nextLine();

        ClupRel relPlayer = new ClupRel(relId, relName, relNumber, Rcode);

        System.out.println("\nFootball Club Player Data:");
        fcPlayer.printData();

        System.out.println("\nReligion Club Player Data:");
        relPlayer.printData();

        scanner.close();
    }
}