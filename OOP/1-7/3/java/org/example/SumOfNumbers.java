package org.example;

public class SumOfNumbers {
    private int num1;
    private int num2;
    private int num3;

    public SumOfNumbers(int num1, int num2, int num3) {
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        } else {
            throw new IllegalArgumentException("All numbers must be even.");
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        if (num1 % 2 == 0) {
            this.num1 = num1;
        } else {
            throw new IllegalArgumentException("The number must be even.");
        }
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        if (num2 % 2 == 0) {
            this.num2 = num2;
        } else {
            throw new IllegalArgumentException("The number must be even.");
        }
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        if (num3 % 2 == 0) {
            this.num3 = num3;
        } else {
            throw new IllegalArgumentException("The number must be even.");
        }
    }

    public int calculateSum() {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        SumOfNumbers numbers = new SumOfNumbers(2, 4, 6);
        System.out.println("The sum of the numbers is: " + numbers.calculateSum());
    }
}