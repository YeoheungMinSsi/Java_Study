package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();
//        ia.methodB();  // 불가 다른 인터페이스
        System.out.println();

        InterfaceB ib = impl;
//        ib.methodA();  // 불가 다른 인터페이스
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }

}
