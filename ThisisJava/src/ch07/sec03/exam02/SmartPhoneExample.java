package ch07.sec03.exam02;

// exam1과 달리 부모 클래스가 매개변수를 갖는 생성자를 가지고 있는 경우
public class SmartPhoneExample {
    public static void main(String[] args){
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "코랄 레드");

        // Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델 : "+myPhone.model);
        System.out.println("색상 : "+myPhone.color);

    }
}
