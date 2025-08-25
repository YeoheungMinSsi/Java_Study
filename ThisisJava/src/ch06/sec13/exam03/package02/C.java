package ch06.sec13.exam03.package02;

import ch06.sec13.exam03.package01.*;

public class C {
    public C(){
        // 객체 생성
        A a = new A();

        // 필드값 변경
        a.field1 = 3;  // 문제 x
//        a.field2 = 3;  // 접근 불가 - 다른 패키지 (default)
//        a.field3 = 3;  // 접근 불가 - 다른 클래스 (private)

        // 메소드 호출
        a.method1();  // 문제 x
//        a.method2();  // 접근 불가 - 다른 패키지 (default)
//        a.method3();  // 접근 불가 - 다른 클래스 (private)
    }
}
