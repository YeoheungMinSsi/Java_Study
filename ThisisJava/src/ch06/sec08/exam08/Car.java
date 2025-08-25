package ch06.sec08.exam08;

public class Car {
    int gas;  // 필드 선언

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas == 0){
            System.out.println("gas가 없음");
            return false;
        }
        System.out.println("gas가 있음");
        return true;
    }

    void run(){
        while(true){
            if(gas > 0){
                System.out.println("달립니다.(gas잔량 : "+gas + ")");
                gas -= 1;
            }else{
                System.out.println("멈춥니다.(gas 잔량 : "+ gas + ")");
                return;  // 메서드 종료
            }
        }
    }
}
