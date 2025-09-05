package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();  // 리턴 타입이 반드시 Home이여야 함
    }
}
