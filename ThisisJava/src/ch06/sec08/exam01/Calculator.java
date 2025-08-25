package ch06.sec08.exam01;

public class Calculator {
    // 리턴 값 없는 메서드
    void powerOn(){
        System.out.println("전원 On");
    }
    // 리턴 값 없는 메서드
    void powerOff(){
        System.out.println("전원 Off");
    }
    // note: 리턴 값 있는 메서드,
    // note: 호출 시 두 정수 값을 전달 받고, 호출한 곳으로 결과갑 리턴
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    // note: 리턴 값 있는 메서드
    double divide(double x, double y){
        double result = x / y;
        return result;
    }
}
