package SingletonPattern.homework2;

public class MockConnection implements DBConnection {
    // 초기상태 -> 연결되어있으면 안됨
    private ConnectionStatus status = ConnectionStatus.DISCONNECTED;
    private final String type = "Mock";

    // note: DBConnection이 DBConnector로 리펙토링하며 커넥터가 인스턴스를 생성하는 책임을
    // note: 따라서 생성자를 public으로 만들고 커넥터에서 private 접근자 사용
    public MockConnection() {
        System.out.println("MockConnection 인스턴스 생성");
    }

    // note: getInstance를 통해서만 인스턴스를 가져올 수 있도록 많듬
//    private static class DBConnectionHolder {
//        private static final MockConnection INSTANCE = new MockConnection();
//    }

//    public static MockConnection getInstance() {
//        return DBConnectionHolder.INSTANCE;
//    }

    // note: 연결/연결해제를 수행하는 메서드
    @Override
    public void connect() {
        // disconnected 상태일 때 connect로
        if (this.status == ConnectionStatus.DISCONNECTED) {
            System.out.println("[" + type + "DB] Connecting to database...");
            this.status = ConnectionStatus.CONNECTED;
            System.out.println("[" + type + "DB] Connected!");
        } else {
            System.out.println("[" + type + "DB] Already connected to database.");
        }
    }
    @Override
    public void disconnect() {
        // Connected 상태일 때 disconnect로
        if (this.status == ConnectionStatus.CONNECTED) {
            System.out.println("[" + type + "DB] Disconnecting from database...");

            this.status = ConnectionStatus.DISCONNECTED;
            System.out.println("[" + type + "DB] Disconnected!");
        } else {
            System.out.println("[" + type + "DB] Already disconnected from database.");
        }
    }
    @Override
    public Object query(String sql) {
        // DB가 연결되어있지 않다면
        if (this.status != ConnectionStatus.CONNECTED) {
            System.out.println("\"[\" + type + \"DB] Not connected to database.");
            return null;
        }
        System.out.println("[SQL-"+ type + "] Executing query(Query 실행): " + sql);

        return "Mock Result: Date received from" + sql;
    }

    @Override
    public String getStatus() {
        // 연재 status를 출력
        return this.status.toString().toLowerCase();
    }
}
