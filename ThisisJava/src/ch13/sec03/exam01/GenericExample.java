package ch13.sec03.exam01;

public class GenericExample {
    // 제네릭 메서드
    // note: <T>는 타입파라미터, 제네릭 메서드라는 것을 나타냄(타입 파라미터 -> 제네릭 메서드)
    //  메서드 안에서 사용할 타입 파라미터 T를 선언하는 부분
    //  해당 T는 boxing 안에서만 유효
    // note: Box뒤 <T>는 타입 추론과 구체적인 타입 변환 2가지로 진행
    //  타입추론은 main 메서드에서 boxing(100)을 호출할 때, 컴파일러는 100이 Integer 타입인 것을 파악
    //  구제적인 타입 변환은 추론된 타입에 따라, 컴파일러는 boxing 메서드의 모든 T를
    //  Integer로 대체하여 코드를 처리
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        //제네릭 메서드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);
        // public static Box<Integer> boxing(Integer t) {
        //     Box<Integer> box = new Box<Integer>();
        //     box.set(t);
        //     return box;}
        // 위와 같이 진행됨


        // 제네릭 메서드 호출
        Box<String> box2 = boxing("Hello");
        String strValue = box2.get();
        System.out.println(strValue);
        // public static Box<String> boxing(String t) {
        //     Box<String> box = new Box<String>();
        //     box.set(t)
        //     return box;}
        // 위와 같이 진행됨
    }

}
