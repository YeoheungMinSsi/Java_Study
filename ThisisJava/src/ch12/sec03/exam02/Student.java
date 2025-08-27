package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() { return no; }
    public String getName() { return name; }

    // Object의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴
    // 번호와 이름이 같으면 동일한 해시코드가 생성
//    @Override
//    public int hashCode(){
//        int hashCode = no + name.hashCode();
//        return hashCode;
//    }

    // Object의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고, 학생 번호와 이름이 같으면 true를 리턴
    @Override
    public boolean equals(Object obj) {
        // obj가 Student 타입인지 확인하고, 맞다면 obj를 Student 타입으로 자동변환하여 객체를 target에 대입
        // note: obj가 Student 타입이라도 컴파일러가 Object 타입으로 인식하기 때문에 자동 변환함
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
//            return no == target.getNo() && name.equals(target.getName());  // if문 단순화
        }
        return false;
    }
}
