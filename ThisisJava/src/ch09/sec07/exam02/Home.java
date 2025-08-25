package ch09.sec07.exam02;

public class Home {
    // 필드에 익명 구현 객체 대입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn(){
            System.out.println("Tv 전원 On");
        }

        @Override
        public void turnOff(){
            System.out.println("TV 전원 Off");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    // 메소드(로컬 변수 이용)
    public void use2(){
        RemoteControl rc = new RemoteControl(){
            @Override
            public void turnOn(){
                System.out.println("에어컨 전원 On");
            }

            @Override
            public void turnOff(){
                System.out.println("에어컨 전원 Off");
            }
        };
    }

    // 메소드(매개변수 이름)
    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }

}
