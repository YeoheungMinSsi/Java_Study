package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member mem = new Member("winter", "눈송이", 25);

        // Getter 메서드 호출
        System.out.println(mem.id());
        System.out.println(mem.name());
        System.out.println(mem.age());

        System.out.println(mem.toString());
        System.out.println();

        Member mem1 = new Member("winter", "눈송이", 25);
        Member mem2 = new Member("winter", "눈송이", 25);
        System.out.println("mem1.hashCode() : " + mem1.hashCode());
        System.out.println("mem2.hashCode() : " + mem2.hashCode());
        System.out.println("mem1.equals(mem2) : " + mem1.equals(mem2));

    }
}
