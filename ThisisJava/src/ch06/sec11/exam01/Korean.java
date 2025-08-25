package ch06.sec11.exam01;

public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name){
        this.ssn = ssn;  // 생성자로 값을 초기화할 때 값이 final 값
        this.name = name;
    }
}
