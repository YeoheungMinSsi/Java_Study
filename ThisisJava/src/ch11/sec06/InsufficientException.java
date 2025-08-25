package ch11.sec06;

// note : extends Exception을 통해 일반 예외를 선언
public class InsufficientException extends Exception {
    // 2개의 생성자 선언
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }

}
