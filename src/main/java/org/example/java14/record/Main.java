package org.example.java14.record;

public class Main {

    public static void main(String[] args) {
        Person john = new Person("John", 30);

        String result = john.name() + "의 나이는 " +
                john.age();

        System.out.println(result);
    }

}
