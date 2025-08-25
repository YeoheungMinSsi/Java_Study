package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        // 정사각형(네 면의 길이가 같은 사각형)의 길이 구하는 메서드
        double result1 = myCal.areaRectangle(10);
        // 직사각형(높이와 넓이가 다른 사각형)의 길이를 구하는 정사각형 구하는 메서드 명과 같은 메서드 - 오버로딩
        double result2 = myCal.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
