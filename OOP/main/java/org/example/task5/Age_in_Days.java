package org.example.task5;

public class Age_in_Days {

    private int totalDays;

    public Age_in_Days(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getYears() {
        return totalDays / 365;
    }

    public int getMonths() {
        int remaining = totalDays % 365;
        return remaining / 30;
    }

    public int getDays() {
        int remaining = totalDays % 365;
        return remaining % 30;
    }
}
