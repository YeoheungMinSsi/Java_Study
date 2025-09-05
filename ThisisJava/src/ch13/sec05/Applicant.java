package ch13.sec05;

// 타입 파라미터 T 선언 - 정의하지 않은 타입 T를 선언
public class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}
