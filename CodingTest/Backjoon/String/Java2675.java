import java.util.Scanner;

public class Java2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String S = sc.next();

            StringBuilder sb = new StringBuilder();  // 가변 객체 생성, 문자열 조작시 새 객체가 아닌 현재 객체를 수정하는 방식
            for(char c : S.toCharArray()){
                for(int j = 0; j < R; j++){
                    sb.append(c);  // R번 만큼 반복하면서 sb에 문자열 S의 각 문자를 입력함 R이 2, S의 첫 문자가 c라면 cc가 sb에 추가
                }
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
