package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드 값 읽기 -> 초기값 확인
        System.out.println("model : " + myCar.model);
        System.out.println("start : " + myCar.start);
        System.out.println("speed : " + myCar.speed);
    }
}
