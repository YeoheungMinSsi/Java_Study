package ch09.sec04.exam01;

// note: 로컬 클래스 - 생성자/메소드 안 클래스
public class A {

    // 생성자
    A(){
        //로컬 클래스 설정
        class B{ }

        // 로컬 객체 생성
        B b = new B();
    }

    // 메소드
    void method(){
        // 로컬 클래스 설정
        class B{ }

        // 로컬 객체 설정
        B b = new B();
    }
}
