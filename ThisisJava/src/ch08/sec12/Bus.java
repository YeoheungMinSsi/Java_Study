package ch08.sec12;

public class Bus implements Vehicle{
    // 추상 메소드 재정의
    @Override
    public void run(){
        System.out.println("버스 달림");
    }

    public void checkFare(){
        System.out.println("승차요금 확인");
    }
}
