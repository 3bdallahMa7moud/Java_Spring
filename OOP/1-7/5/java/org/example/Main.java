package org.example;

abstract class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
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
}

abstract class ShareData {
    private String phone;

    public ShareData(String phone) {
        if (phone != null && phone.length() == 13 && phone.startsWith("+20")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must be a valid Egyptian number and start with +20");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 13 && phone.startsWith("+20")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone must be a valid Egyptian number and start with +20");
        }
    }
}

class Person extends BaseEntity {

    public Person(int id, String name) {
        super(id, name);
    }

    public void printData() {
        System.out.println("Person ID: " + getId());
        System.out.println("Person Name: " + getName());
    }
}

class Player extends BaseEntity {
    private int number;
    private String phone;

    public Player(int id, String name, int number, String phone) {
        super(id, name);
        this.phone = phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printData() {
        System.out.println("Player ID: " + getId());
        System.out.println("Player Name: " + getName());
        System.out.println("Player Number: " + number);
        System.out.println("Player Phone: " + getPhone());
    }
}

class Student extends BaseEntity {
    private int age;
    private String phone;

    public Student(int id, String name, int age, String phone) {
        super(id, name);
        this.phone = phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printData() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
        System.out.println("Student Age: " + age);
        System.out.println("Student Phone: " + getPhone());
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "Michael");
        Player player = new Player(2, "LeBron", 23, "+201234567890");
        Student student = new Student(3, "John", 20, "+201112233445");

        person.printData();
        player.printData();
        student.printData();
    }
}