import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Java10809{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        int[] arr = new int[26];
//        Arrays.fill(arr,-1);
//
//        for (int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);  // 입력한 string 순으로 하나의 문자 생성
//
//            // a는 아스키 코드가 97
//            //  ch가 b일때 98-97 즉 자리수 1으로 설정
//            if(arr[ch - 'a'] == -1){
//                arr[ch - 'a'] = i;  // ch가 b일때(첫번째 반복) arr[1]에 0을 입력
//            }
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();  // BufferedReader은 readLine으로만 입력받는데 한 줄의 문자열만 입력받음

        for(char c = 'a'; c <= 'z'; c++){
            sb.append(s.indexOf(c)+" ");  // 문자열을 a부터 z까지 찾는데 찾은 문자열의 위치를 sb에 저장함
        }
        System.out.println(sb);
    }

}