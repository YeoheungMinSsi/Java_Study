package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        // note: System.out.println() 메서드는 매개값이 기본 타입이거나 문자열일 경우 해당 값을 그대로 출력
        // 만약 매개값이 객체가 되면 객체의 toString() 메서드를 호출해서 리턴값을 출력
        System.out.println(myPhone);
    }
}
