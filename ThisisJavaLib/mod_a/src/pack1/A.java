package pack1;

import pack2.B;
import pack3.C;

public class A {
    // 메서드 선언
    public void method() {
        System.out.println("A 메서드 생성");

        B b = new B();
        b.method();
    }

    // 메소드-mod.b 모듈의 pack3.C 타입 리턴
    public C getC() {
        C c = new C();
        return c;
    }

}
