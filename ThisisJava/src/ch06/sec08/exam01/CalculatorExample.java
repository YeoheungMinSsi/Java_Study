package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        // 리턴 값 없는 메서드 호출
        myCal.powerOn();

        // 리턴 값 있는 메서드에 매개변수 설정 및 대입
        int result1 = myCal.plus(5, 6);
        System.out.println(result1);

        // 변수에 값 대입 후 메서드 매개변수 사용
        int x = 10;
        int y = 4;
        double result2 = myCal.divide(x, y);
        System.out.println(result2);

        myCal.powerOff();
    }
}
