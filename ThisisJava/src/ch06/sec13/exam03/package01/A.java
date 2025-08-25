package ch06.sec13.exam03.package01;

public class A {
    // public 접근 제한을 갖는 필드 선언
    public int field1;
    // default 접근 제한을 갖는 필드 선언
    int field2;
    // private 접근 제한을 갖는 필드 선언
    private int field3;

    // 생성자 선언
    public A(){
        field1 = 1;  // 문제 x(public)
        field2 = 1;  // 문제 x(default) - 같은 패키지 내
        field3 = 1;  // 문제 x(private) - 같은 클래스 내

        method1();  // 문제 x(public)
        method2();  // 문제 x(default) - 같은 패키지 내
        method3();  // 문제 x(private) - 같은 클래스 내
    }

    // public 접근 제한을 갖는 메소드 선언
    public void method1(){}
    // default 접근 제한을 갖는 메소드 선언
    void method2(){}
    // private 접근 제한을 갖는 메소드 선언
    private void method3(){}


}
