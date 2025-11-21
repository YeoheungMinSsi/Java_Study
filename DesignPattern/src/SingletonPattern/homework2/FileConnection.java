package SingletonPattern.homework2;

public class FileConnection implements DBConnection {
    // 초기상태 -> 연결되어있으면 안됨
    private ConnectionStatus status = ConnectionStatus.DISCONNECTED;
    private final String type = "File";

    // note: DBConnection이 DBConnector로 리펙토링하며 커넥터가 인스턴스를 생성하는 책임을
    // note: 따라서 생성자를 public으로 만들고 커넥터에서 private 접근자 사용
    public FileConnection() {
        System.out.println("FileConnection 인스턴스 생성");
    }

    // note: 연결/연결해제를 수행하는 메서드
    @Override
    public void connect() {
        // disconnected 상태일 때 connect로
        if (this.status == ConnectionStatus.DISCONNECTED) {
            System.out.println("[DB: " + type + "] Attempting to connect to file system...");
            this.status = ConnectionStatus.CONNECTED;
            System.out.println("[DB: " + type + "] File system connection established!");
        } else {
            System.out.println("[DB: " + type + "] Already connected to file system.");
        }
    }
    @Override
    public void disconnect() {
        // Connected 상태일 때 disconnect로
        if (this.status == ConnectionStatus.CONNECTED) {
            System.out.println("[DB: " + type + "] Disconnecting from file system...");

            this.status = ConnectionStatus.DISCONNECTED;
            System.out.println("[DB: " + type + "] Already Disconnected!");
        } else {
            System.out.println("[DB: " + type + "] Already disconnected from database.");
        }
    }
    @Override
    public Object query(String sql) {
        // DB가 연결되어있지 않다면
        if (this.status != ConnectionStatus.CONNECTED) {
            System.out.println("[DB: " + type + "] Not connected. Cannot perform file operation.");
            return null;
        }
        System.out.println("[" + type.toUpperCase() + "] Executing query(Query 실행): " + sql);

        return "File result: Simulated data laod from file.";
    }

    @Override
    public String getStatus() {
        // 연재 status를 출력
        return this.status.toString().toLowerCase();
    }
}
