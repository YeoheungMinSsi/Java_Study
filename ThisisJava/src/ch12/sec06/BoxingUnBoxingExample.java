package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("박싱 : " + obj.intValue());  // intValue() 메소드는 Integer 객체 내부의 int 값을 리턴

        // UnBoxing
        int value = obj;
        System.out.println("언박싱 : " + value);

        // 연산 시 UnBoxing
        int result = obj + 100;
        System.out.println("연산 시 언박싱 : " + result);
    }
}
