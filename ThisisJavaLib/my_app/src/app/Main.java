package app;

import pack1.A;
//import pack2.B;  // pack 2 은닉처리
import pack3.C;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.method();  // A 클래스의 메소드 안에 B 객체가 생성되어 b.method 호출

//        B b = new B();
//        b.method();

        C c = new C();
        c.method();

        C result = a.getC();
        result.method();
    }
}
