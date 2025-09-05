package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws Exception{
        // how1
        Class clazz = Car.class;

        // how2 - 예외가 발생할 수 있어 main 메서드에 Exception 예외 처리를 해야함
        Class clazz2 = Class.forName("ch12.sec11.exam01.Car");

        // how3
        Car myCar = new Car();
        Class clazz3 = myCar.getClass();

        // 패키지 정보 읽기
        System.out.println("패키지 : " + clazz.getPackage().getName());
        System.out.println("패키지 : " + clazz2.getPackage().getName());
        System.out.println("패키지 : " + clazz3.getPackage().getName());
        // 패키지를 제외한 타입이름
        System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
        System.out.println("클래스 간단 이름 : " + clazz2.getSimpleName());
        System.out.println("클래스 간단 이름 : " + clazz3.getSimpleName());
        // 패키지를 포함한 전체 타입 이름
        System.out.println("클래스 전체 이름 : " + clazz.getName());
        System.out.println("클래스 전체 이름 : " + clazz2.getName());
        System.out.println("클래스 전체 이름 : " + clazz3.getName());
    }
}
