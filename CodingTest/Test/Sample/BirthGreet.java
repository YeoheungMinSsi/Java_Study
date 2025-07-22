import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirthGreet {
    public static void main(String[] args) throws IOException {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));

        String name = rb.readLine();

        greet(name);
    }
    public static void greet(String name) {
        String greeting = name + "아! 생일축하해!!";
        System.out.println(greeting);
    }
}
