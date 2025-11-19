package SingletonPattern.pattern.homework1;

public enum LogLevel {
    LOG("LOG"),
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR");

    private final String levelName;

    // Enum 생성자
    LogLevel(String levelName){
        this.levelName = levelName;
    }

    @Override
    public String toString(){
    return this.levelName;
    }
}
