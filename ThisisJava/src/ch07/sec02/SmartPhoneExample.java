package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args){
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "코발트 블루");

        // Phone으로 상속받은 필드 읽기
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        // SmartPhone 필드 읽기
        System.out.println(myPhone.wifi);

        // Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoices("여보세요");
        myPhone.receiveVoice("안녕하세요");
        myPhone.sendVoices("네 안녕하세요");

        myPhone.hangUp();

        // SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();

    }
}
