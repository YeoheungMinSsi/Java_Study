import java.util.*;

public class Java27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = sc.nextInt();

        System.out.printf("%c\n", S.charAt(i-1));  // charAt 을 사용하면 문자열의 위치에 해당하는 문자를 가져올수 있음
    }
}
