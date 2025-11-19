package SingletonPattern.pattern.homework1;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Logger {
    // 시간 포맷 정의 객체
    private static final DateTimeFormatter formatter = DateTimeFormatter.
            ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    // 내부 배열 log
    private final List<String> logs;

    // note: private를 통해서 new를 통해서 생성자 생성을 막음
    private Logger() {
        this.logs = new ArrayList<>();
    }

    // Bill Push 싱글턴 패턴
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    // note: 인스턴스에 접근할 수 있는 정적 메서드(new를 통해서 생성 차단)
    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    private void printLogs(LogLevel level, String message){
        // note: ISO 8601 포맷 타임스탬프를 위해 ZoneOffset 라이브러리 사용
        String timeStamp = LocalDateTime.now(ZoneOffset.UTC).format(formatter);
        String levelName = level.toString();

        String log = String.format("[%s][%s] %s", levelName, timeStamp, message);
        // 로그 출력 부분
        System.out.println(log);
        // logs배열 안에 log 저장
        this.logs.add(log);
    }

    public void log(String message){
        printLogs(LogLevel.LOG, message);
    }

    public void info(String message){
        printLogs(LogLevel.INFO, message);
    }

    public void warn(String message){
        printLogs(LogLevel.WARN, message);
    }

    public void error(String message){
        printLogs(LogLevel.ERROR, message);
    }

    public List<String> getLogs(){
        return this.logs;
    }
    
}
