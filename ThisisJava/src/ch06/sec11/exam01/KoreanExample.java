package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args){
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "김정윤");

        // 필드 값 읽ㄱ
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        // Final 필드는 값을 변경 불가능
        // k1.nation = "USA"; 불가능

        // 비 final 필드는 값 변경 가능
        k1.name = "김장미";
        System.out.println(k1.name);
    }
}
