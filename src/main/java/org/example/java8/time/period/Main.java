package org.example.java8.time.period;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Person john = new Person(Period.of(1990, 1, 1));

        int years = john.birthday().getYears(); // 1990
        int months = john.birthday().getMonths(); // 1
        int days = john.birthday().getDays(); // 1

        System.out.println("1. John's birthday is "+years+" years, "+months+" months, and "+days+" days old.");
    }
}
