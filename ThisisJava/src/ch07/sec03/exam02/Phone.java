package ch07.sec03.exam02;

// exam1과 달리 부모 클래스가 매개변수를 갖는 생성자를 가지고 있는 경우
public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 매개변수를 갖는 생성자 선언, 매개변수 없는 기본 생성자 없음
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("부모인 Phone(String model, String color)생성자 실행");
    }
}
