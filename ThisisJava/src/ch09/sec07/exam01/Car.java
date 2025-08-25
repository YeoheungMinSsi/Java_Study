package ch09.sec07.exam01;

public class Car {
    // 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // 필드의 익명 자식 객체 대입
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이  회전");
        }
    };  // 객체이기 때문에 클래스처럼 선언했어도 세미콜론을 붙여야 함

    // 메소드(필드 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    // 메소드(로컬 변수 이용)
    public void run2(){
        // 로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire(){
            @Override
            public  void roll(){
                System.out.println("익명 자식 Tire 객체 2가 회전");
            }
        };
        tire.roll();
    }

    // 메소드(매개변수 이용)
    public void run3(Tire tire){
        tire.roll();
    }

}
