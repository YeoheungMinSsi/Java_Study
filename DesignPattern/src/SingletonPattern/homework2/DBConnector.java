package SingletonPattern.homework2;

public class DBConnector {
    private static final DBConnector INSTANCE = new DBConnector();
    private final DBConnection dbConnection;
    private static final String DB_TYPE_PROPERTY = "DB.Connection.Type";
    // 생성자
    private DBConnector(){
        String typeString = System.getProperty(DB_TYPE_PROPERTY, "Mock");
        DBType dbType = DBType.fromString(typeString);

        System.out.println("DBConnector 초기화: 설정된 DB 타입" + dbType);

        this.dbConnection = switch (dbType){
            case MOCK -> new MockConnection();
            case MYSQL -> new MySQLConnection();
            case POSTGRESQL -> new PostgreSQLConnection();
            default -> throw new IllegalArgumentException("지원하지 않는 DB 타입 입니다." + dbType);
        };
    }

    public static DBConnector getInstance(){
        return INSTANCE;
    }


    public DBConnection getConnection(){
        return dbConnection;
    }
}
