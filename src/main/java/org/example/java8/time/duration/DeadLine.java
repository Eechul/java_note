package org.example.java8.time.duration;

import java.time.Duration;

public class DeadLine {

    private final Duration days;

    public DeadLine(Duration days) {
        this.days = days;

    }

    public Duration getDays() {
        return days;
    }
}
