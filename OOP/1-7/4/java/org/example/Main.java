package org.example;

abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be greater than 0");
        }

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printData();
}

class Player extends Person {
    private int number;

    public Player(int id, String name, int number) {
        super(id, name);
        if (String.valueOf(number).length() <= 2) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Number length must be less than or equal to 2 digits");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (String.valueOf(number).length() <= 2) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Number length must be less than or equal to 2 digits");
        }
    }

    @Override
    public void printData() {
        System.out.println("Player ID: " + getId());
        System.out.println("Player Name: " + getName());
        System.out.println("Player Number: " + number);
    }
}

class Student extends Person {
    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        if (age > 7 && age < 30) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 7 and less than 30");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 7 && age < 30) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be greater than 7 and less than 30");
        }
    }

    @Override
    public void printData() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
        System.out.println("Student Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1, "Michael", 99);
        Student student = new Student(2, "John", 20);

        player.printData();
        student.printData();
    }
}