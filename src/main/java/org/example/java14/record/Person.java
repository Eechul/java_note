package org.example.java14.record;

public record Person(String name, int age) { // final로 선언된 필드를 가짐

    public Person {
        // 생성자 메서드 제정의 가능
        if (age < 0) {
            throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
        }
    }

    // toString, equals, hashCode 재정의 가능
//    @Override
//    public String toString() {
//        return null;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }


}
