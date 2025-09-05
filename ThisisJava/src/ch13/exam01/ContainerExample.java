package ch13.exam01;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> con1 = new Container<String>();
        con1.set("이칠기");
        String str = con1.get();

        Container<Integer> con2 = new Container<Integer>();
        con2.set(10);
        int value = con2.get();

        System.out.println(str);
        System.out.println(value);
    }
}
