package SingletonPattern.homework2;

public interface DBConnection {
    void connect();
    void disconnect();
    Object query(String sql);
    ConnectionStatus getStatus();
}
