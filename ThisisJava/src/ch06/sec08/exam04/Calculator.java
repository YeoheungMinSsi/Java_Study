package ch06.sec08.exam04;

public class Calculator {
    // note: 메서드 오버로딩 - 같은 메서드명, 다른 매개변수
    double areaRectangle(double width){
        return width * width;
    }
    double areaRectangle(double width, double height){
        return width * height;
    }
}
