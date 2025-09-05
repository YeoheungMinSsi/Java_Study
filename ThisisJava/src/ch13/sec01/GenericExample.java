package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // Box<String> box1 = new Box<String>();
        // Box를 생성할 때는 타입 파라미터 T 대신 String으로 대체
        Box<String> box1 = new Box<>();
        box1.contents = "안녕하세요";
        String str = box1.contents;
        System.out.println(str);

        // Box<Integer> box1 = new Box<Integer>();
        // Box를 생성할 때는 타입 파라미터 T 대신 Integer으로 대체
        Box<Integer> box2 = new Box<>();
        box2.contents = 100;
        int value = box2.contents;
        System.out.println(value);

    }
}