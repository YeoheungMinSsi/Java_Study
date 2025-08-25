package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
    /*
        Singleton obj1 = new Singleton();  // 컴파일 에러 -> 생성자 private
        Singleton obj2 = new Singleton();  // 컴파일 에러
    */
        // 정적 메소드를 호출해 싱글톤 객체 얻음
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();

        if(obj3 == obj4){
            System.out.println("동일한 Singleton 객체");
        }else {
            System.out.println("다른 Singleton 객체");
        }

    }
}
