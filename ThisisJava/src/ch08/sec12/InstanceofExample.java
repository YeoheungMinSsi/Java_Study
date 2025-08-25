package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle){
        // 방법 1 - 매개 값이 Bus인 경우 강제 타입 변환해서 checkFare() 메소드 호출
        // note: 매개값(vehicle)이 Bus 타입인 경우 vehicle을 Bus 타입으로 강제 타입 변환하여 Bus의 메소드를 사용
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;  // 강제 타입 변환
            bus.checkFare();
        }

        // 방법 2 - 자동 타입 변환
        if(vehicle instanceof Bus bus) bus.checkFare();

        vehicle.run();

    }


}
