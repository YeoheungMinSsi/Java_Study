package SingletonPattern.homework2;

public enum DBType {
    MOCK,
    POSTGRESQL,
    MYSQL,
    SQLITE,
    FILE;

    public static DBType fromString(String dbType){
        try{
            return DBType.valueOf(dbType.toUpperCase());
        }catch(IllegalArgumentException e){
            return MOCK;
        }
    }
}
