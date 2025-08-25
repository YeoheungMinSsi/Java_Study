package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A{
    // 생성자 선언
    public D(){
        //A() 생성자 호출
        super();  // 문제없음, 상속
    }

    // 메소드 선언
    public void mtehod(){
        // A 필드값 변경
        super.field = "value";  // 문제없음, 상속 후 super를 통한 값 변경
        // A 메소드 호출
        super.method();  // 문제없음, 상속 후 super를 통한 메소드 호출
    }

    // 메소드 선언
    // 상속시에 super를 통한 접근은 가능하지면 직접 객체 생성은 오류
//    public void method2(){
//        A a = new A();
//        a.field = "value";
//        a.method();
//    }

}
