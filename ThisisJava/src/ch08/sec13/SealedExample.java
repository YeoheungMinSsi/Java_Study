package ch08.sec13;

public class SealedExample {
    public static void main(String[] args){
        ImplClass impl = new ImplClass();

        InterfaceA ia = impl;
        ia.methodA();

        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();  // InterfaceA를 상속 받아서 A 메소드 사용
        ib.methodB();

        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();  // B를 상속봉인을 해제하고 B를 상속받아 A, B 메소드 사용 가능
        ic.methodC();
    }
}
