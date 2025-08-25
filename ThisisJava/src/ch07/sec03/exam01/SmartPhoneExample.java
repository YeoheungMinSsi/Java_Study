package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args){
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "파스텔 블랙");

        // Phone으로부터 상속 받은 필드 읽기
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

    }
}
