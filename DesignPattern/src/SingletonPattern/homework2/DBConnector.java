package SingletonPattern.homework2;

public class DBConnector {
    private static final DBConnector INSTANCE = new DBConnector();

    private final DBConnection dbConnection;

    // 생성자
    private DBConnector(){
        String dbType = System.getenv("DB_TYPE");
    }

    public static DBConnector getInstance(){
        return INSTANCE;
    }


    public DBConnection getConnection(){
        return dbConnection;
    }
}
