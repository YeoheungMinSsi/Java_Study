package SingletonPattern.homework2;

public class DBConnectionTest {
    public static void main(String[] args) {
        MockConnection dbConnect1 = MockConnection.getInstance();
        MockConnection dbConnect2 = MockConnection.getInstance();
        MockConnection dbConnect3 = MockConnection.getInstance();

        System.out.println("test");

        if(dbConnect1 == dbConnect2){
            System.out.println("동일한 인스턴스입니다.");
        }

    }

}
