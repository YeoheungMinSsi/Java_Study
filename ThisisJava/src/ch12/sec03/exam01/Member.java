package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    // note 여기서 id는 객체를 참조하고 있는 주소 값
    @Override  // Object의 equals 메소드 재정의
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {  // obj가 Member 타입인지 검사하고 타입 변환후 target 변수에 대입
            if(id.equals(target.id)){  // id 문자열이 같은지 비교
//                System.out.println(target.id);
                return true;
            }
        }
        return false;
    }

}
