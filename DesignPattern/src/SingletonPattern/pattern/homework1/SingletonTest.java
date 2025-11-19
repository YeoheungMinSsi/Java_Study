package SingletonPattern.pattern.homework1;

public class SingletonTest {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        // test: 인스턴스 로그 확인
        logger1.log("App started");

        // 2. 인스턴스 비교
        boolean isSame1_2 = (logger1 == logger2);
        boolean isSame2_3 = (logger2 == logger3);

        if (isSame1_2 && isSame2_3) {
            System.out.println("동일한 인스턴스 입니다.");
        } else {
            System.out.println("인스턴스가 동일하지 않습니다.");
        }

        // 3. 메모리 주소비교(hashCode)를 통한 간접 확인(객체 주소 확인)
        System.out.println("logger1 =" + logger1.hashCode());
        System.out.println("logger2 =" + logger2.hashCode());
        System.out.println("logger3 =" + logger3.hashCode());

    }
}
