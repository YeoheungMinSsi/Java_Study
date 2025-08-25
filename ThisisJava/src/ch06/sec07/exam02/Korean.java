package ch06.sec07.exam02;

public class Korean {
    String nation = "대한민국";  // 대한민국 국민의 공통 값은 대한민국
    String name;  // 이름은 각각 고유값이 존재함
    String ssn;  // 주민번호도 각 고유값이 존재

    public Korean(String n, String s){
        name = n;  // 추후 생성 시 생성자 매개변수 n이 name으로 대입 됨
        ssn = s;
    }
}
