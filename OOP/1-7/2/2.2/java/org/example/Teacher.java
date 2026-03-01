package org.example;
// 2.2
public class Teacher {
    private Long id;
    private String name;
    private float age;
    private String phoneNumber;
    private float salary;

    public Teacher(Long id, String name, float age, String phoneNumber, float salary) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be greater than 0");
        }

        if (name.length() >= 3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be at least 3 characters long and only contain alphabetic characters");
        }

        if (age >= 25 && age <= 60) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 25 and 60");
        }

        if (phoneNumber.startsWith("+20") && phoneNumber.length() == 13) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Phone number must start with +20 and be 13 characters long");
        }

        if (salary >= 3000) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than or equal to 3000");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (name.length() >= 3 && name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be at least 3 characters long and only contain alphabetic characters");
        }
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        if (age >= 25 && age <= 60) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 25 and 60");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+20") && phoneNumber.length() == 13) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Phone number must start with +20 and be 13 characters long");
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary >= 3000) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be greater than or equal to 3000");
        }
    }

    public void printTeacherInfo() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Age: " + age);
        System.out.println("Teacher Phone Number: " + phoneNumber);
        System.out.println("Teacher Salary: " + salary);
    }
}