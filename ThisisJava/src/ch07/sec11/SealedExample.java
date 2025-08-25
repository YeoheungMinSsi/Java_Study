package ch07.sec11;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee em = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        em.work();
        m.work();
        d.work();
    }
}
