package SingletonPattern.pattern.homework1;

// note : 로그 처리 객체(파일 저장, 콘솔 출력 등)가 구현해ㅑ할 규약 정의
public interface LogObserver {
    // 완성된 문자열 로그를 받아서 처리하는 메서드
    void log(String logEntry);
}
