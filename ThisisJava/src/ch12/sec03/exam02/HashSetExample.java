package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();  // 원시적인 방법
//        HashSet<Student> hashSet = new HashSet<>();  // 현재 사용하는 방법

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        // s1과 동등 객체이기 때문에 중복 저장하지 않음
        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수 : " + hashSet.size());
    }
}
