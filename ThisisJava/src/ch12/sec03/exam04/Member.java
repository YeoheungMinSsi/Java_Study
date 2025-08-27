package ch12.sec03.exam04;

public record Member(String id, String name, int age) {
}

// note: public record Member(String id, String name, int age) {} 와 아래 class 선언은 논리적으로 동일함
//public class Memeber{
//    private final String id;
//    private final String name;
//    private final int age;
//
//    public Member(String id, String name, int age){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int hashCode() {
//        ...
//    }
//    @Override
//    public boolean equals(Object obj) {
//        ...
//    }
//    @Override
//    public String toString() {
//        ...
//    }
//}