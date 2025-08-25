package ch06.sec07.exam03;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    // 매개변수는 가독성이 좋도록 해야함
    public Korean(String name, String ssn){
        this.name = name;  // 가독성을 위해 매개변수 값을 필드 값과 동일하게 만듦
        this.ssn = ssn;  // 필드임을 구분하기 위해 this 키워드를 필드앞에 붙임
        // this는 현재 객체를 의미함, this.name은 현재 객체의 데이터(필드)로서 name을 말함
    }
}
