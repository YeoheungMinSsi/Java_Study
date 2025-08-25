package ch08.sec02;

public class Television implements RemoteControl{
    @Override
    public void turnOn(){
        System.out.println("TV를 켬");  // 인터페이스에 선언된 추상 메서드 재정의
    }
}
