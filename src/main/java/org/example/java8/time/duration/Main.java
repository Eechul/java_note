package org.example.java8.time.duration;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        DeadLine myProjectDeadLine = new DeadLine(Duration.ofDays(1));

        System.out.println("1. 내 데드라인이 "+myProjectDeadLine.getDays().getSeconds()+"초 남았군..");
        System.out.println("2. 내 데드라인이 "+myProjectDeadLine.getDays().getNano()+"나노 남았군..");
    }
}
