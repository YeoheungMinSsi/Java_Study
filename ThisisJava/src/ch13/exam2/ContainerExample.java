package ch13.exam2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> con1 = new Container<String, String>();
        con1.set("이칠기", "도적");
        String name1 = con1.getKey();
        String job = con1.getValue();

        Container<String, Integer> con2 = new Container<String, Integer>();
        con2.set("이칠기", 25);
        String name2= con2.getKey();
        int age = con2.getValue();

        System.out.println("이름 " + name1 + ", 직업 : " + job);
        System.out.println("이름 " + name2 + ", 나이 : " + age);
    }
}
