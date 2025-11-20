package SingletonPattern.homework1;

import java.util.List;

public class InMemoryAdapter implements LogObserver {
    private final List<String> logList;

    public InMemoryAdapter(List<String> logList){
        this.logList = logList;
    }

    @Override
    public void log(String logEntry) {
        this.logList.add(logEntry);
    }
}
