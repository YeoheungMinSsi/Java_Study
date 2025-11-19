package SingletonPattern.pattern.homework1;

public class ConsoleAdapter implements LogObserver {
    // console 출력 구현체
    @Override
    public void log(String logEntry){
        System.out.println(logEntry);

    }
}
