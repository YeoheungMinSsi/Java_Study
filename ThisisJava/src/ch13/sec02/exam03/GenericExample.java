package ch13.sec02.exam03;

public class GenericExample {
    public static void main(String[] args){
        Box box1 = new Box();
        box1.content = "100";  // 컨텐츠 타입이 String

        Box box2 = new Box();
        box2.content = "100";

        Box box3 = new Box();
        box3.content = 100;

        // box1의 content와 box2의 content의 내용물 비교
        boolean result = box1.compare(box2);
        System.out.println(result);

        // box1의 content와 box3의 content의 내용물 비교
        result = box1.compare(box3);
        System.out.println(result);
    }
}
