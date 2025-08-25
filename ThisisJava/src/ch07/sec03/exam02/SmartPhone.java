package ch07.sec03.exam02;

// exam1과 달리 부모 클래스가 매개변수를 갖는 생성자를 가지고 있는 경우
public class SmartPhone extends Phone {
    //자식 생성자 선언
    public SmartPhone(String model, String color){
        super(model, color);  // 반드시 작성 필요
        System.out.println("자식인 SmartPhone(String model, String model) 생성자 실행됨");
    }

}
