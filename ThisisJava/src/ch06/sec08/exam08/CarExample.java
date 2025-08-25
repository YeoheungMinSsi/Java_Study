package ch06.sec08.exam08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        if(myCar.isLeftGas()){
            // setGas에서 Gas를 충전하여 isLeftGas 메소드가 true
            // gas있다는 출력후 아래 코드 수행(출발합니다)
            System.out.println("출발합니다.");

            // 출발후 while문을 통해서 달린다 출력과 gas 잔량이 점점 줄어듦
            // gas가 0이 되고 run 메서드에 있는 멈춥니다 출력후 아래 gas 주입하세요 출력
            myCar.run();
        }

        System.out.println("gas를 주입하세요");
    }
}
