package ch09.sec04.exam03;

public class A {
    // 메소드
    public void method1(int arg){  // 로컬 클래스에서 사용할 경우 final int arg 처럼 final 값이 됨
        // 로컬 변수
        int var = 1;  // 로컬 클래스에서 사용할 경우 final int var 처럼 final 값이 됨

        // 로컬 클래스
        class B{
            //메소드
            void method2(){
                // 로컬 변수 읽기
                System.out.println(arg);
                System.out.println(var);

                // 로컬 변수 수정
                // arg = 2;  => 안됨(final 값이 되버림)
                // var = 2;  => 안됨(final 값이 되버림)
            }
        }

        // 로컬 객체 생성
        B b = new B();

        // 로컬 객체 메소드 호출
        b.method2();

        // 로컬 변수 수정
//        arg = 5;  // => 안됨(final 값이 되버림)
//        var = 5;  // => 안됨(final 값이 되버림)
//        System.out.println(arg);
//        System.out.println(var);
    }
}
