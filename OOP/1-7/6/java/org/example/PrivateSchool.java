package org.example;

public class PrivateSchool {
    private int id;
    private String name;

    public PrivateSchool(int id, String name) {
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

    public void printData() {
        System.out.println("Private School ID: " + id);
        System.out.println("Private School Name: " + name);
    }
}