package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args){
        // 생성자에 맞는 매개변수를 입력해줌
        Car myCar = new Car("그랜저", "검정", 150);
        // 만약 생성자 매개변수가 설정되어있는데 객체를 생성할 때 매개변수를 입력하지 않으면 생성자가 생성되지 않음
//        Car myCar1 = new Car();  // 오류 발생, 매개변수 입력하지 않음
    }
}
