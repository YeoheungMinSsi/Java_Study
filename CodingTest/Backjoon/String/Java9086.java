import java.util.*;

public class Java9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String M = sc.next();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += M.charAt(i) - '0'; // 문자를 숫자로 변환하여 더함, 아스키 코드로 변경되는데 문자 0을 빼서 1이 49 0이 48이기 때문에 0을 빼서 결과를 얻음
        }

        System.out.println(sum); // 최종 합계 출력
        sc.close();
    }
}
