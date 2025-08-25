package ch06.sec13.exam03.package01;

public class B {
    public void method(){
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 2;  // 문제 x
        a.field2 = 2;  // 문제 x (default) - 같은 패키지
//        a.field3 = 2;  // 접근불가 (private) - 다른 클래스

        a.method1();  // 문제 x
        a.method2();  // 문제 x (default) - 같은 패키지
//        a.method3();  // 접근불가 (private) - 다른 클래스
    }
}
