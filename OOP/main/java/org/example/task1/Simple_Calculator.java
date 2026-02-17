package org.example.task1;

public class Simple_Calculator {

    private int x;
    private int y;

    public Simple_Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return x + y;
    }

    public int multiply() {
        return x * y;
    }

    public int subtract() {
        return x - y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
