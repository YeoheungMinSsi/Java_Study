package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        // 해시코드 확인 (1 + s1(홍길동).hashCode()  == 1 + s2(홍길동).hashCode())
        if(s1.hashCode() == s2.hashCode()){
            if(s1.equals(s2)){
                System.out.println("동등 객체");
            }else{
                System.out.println("데이터가 다름, 다른 객체");
            }
        }else{
            System.out.println("해시코드가 다름, 다른 객체");
        }
    }
}
