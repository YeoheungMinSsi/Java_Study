package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args){
        // Korean 객체 k1 생성
        Korean k1 = new Korean("박지원", "011225-1234567");

        // Korean 객체 읽기
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println();

        // 다른 Korean 객체 k2 생성
        Korean k2 = new Korean("송하영", "970101-1234567");

        // Korean 객체 읽기
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);
    }
}
