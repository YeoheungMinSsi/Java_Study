package ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // 부모의 final 메서드 -> 재정의 불가
//    @Override
//    public void stop(){
//        System.out.println("스포츠카 정지");
//        speed = 0;
//    }
}
