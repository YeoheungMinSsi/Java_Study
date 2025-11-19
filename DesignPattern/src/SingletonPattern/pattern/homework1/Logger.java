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

    private final List<LogObserver> observers = new ArrayList<>();

    // 내부 배열(리스트) logs에 로그를 저장함
    private final List<String> logs;

    // note: private를 통해서 new를 통해서 생성자 생성을 막음
    private Logger() {
        this.logs = new ArrayList<>();
        // note: 메모리에 저장하는 Appender(InMemoryAppender)를 기본 옵저버로 등록
        this.observers.add(new InMemoryAdapter(this.logs));
        this.observers.add(new ConsoleAdapter());
    }

    // Bill Push 싱글턴 패턴
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    // note: 인스턴스에 접근할 수 있는 정적 메서드(new를 통해서 생성 차단)
    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    // note: 어뎁터 관리
    public void addObserver(LogObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(LogObserver observer) {
        this.observers.remove(observer);
    }

    private void notifyObserver(String logEntry) {
        // 등록된 모든 옵저버(Appender)에게 로그 전송
        for (LogObserver observer : this.observers) {
            observer.log(logEntry);
        }
    }

    private void createAndDistributeLog(LogLevel level, String message) {
        // ISO 8601 포맷 생성
        String timeStamp = LocalDateTime.now(ZoneOffset.UTC).format(formatter);
        String levelString = level.toString();

        // [LEVEL][TIMESTAMP] MESSAGE 형식으로 로그 엔트리 생성
        String logEntry = String.format("[%s][%s] %s", levelString, timeStamp, message);

        // 출력/저장 로직 - 옵저버에게 맞김
        notifyObserver(logEntry);
    }

    public void log(String message) {
        createAndDistributeLog(LogLevel.LOG, message);
    }

    public void info(String message) {
        createAndDistributeLog(LogLevel.INFO, message);
    }

    public void warn(String message) {
        createAndDistributeLog(LogLevel.WARN, message);
    }

    public void error(String message) {
        createAndDistributeLog(LogLevel.ERROR, message);
    }

    public List<String> getLogs() {
        return this.logs;
    }

}
