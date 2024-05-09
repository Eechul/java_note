# JAVA 14v - unmodifiableList


## Table of Contents

- [불변리스트?](#불변리스트?)
- [목적](#목적)
- [특징](#특징)

## 불변리스트?
- 불변 리스트는 생성 후 변경 할 수 없는 리스트를 말한다.

## 목적
- '불변' 이라는 단어에 주목해야 하는데, 불변이란 객체가 생성된 후 그 상태를 변경할 수 없다는 것을 의미한다.
- 요소들을 변경할 수 없게 하여 코드 안정성을 높인다.


## 특징
1. 리스트를 초기화하는 과정에서 불변 리스트를 만들 수 있다.
```java
 List<String> unmodifiableList = Arrays.asList("a", "b", "c");
```
2. 스트림에서도 Collect를 활용해 불편 리스트를 만들 수 있다.
```java
 List<String> unmodifiableList = Arrays.asList("a", "b", "c")
                .stream()
                .filter(s -> s.equals("a"))
                .collect(Collectors.toUnmodifiableList());
```
