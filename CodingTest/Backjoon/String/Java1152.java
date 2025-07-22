import java.util.*;
import java.io.*;

public class Java1152 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        System.out.println(st.countTokens());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String[] arr = s.trim().split(" ");
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        Set<Character> set = new HashSet<>();
//
//        String s = br.readLine();
//        s = s.replaceAll(" ","").toUpperCase();
//
//
//        for(char c : s.toCharArray()) {
//            if (set.add(c)){
//                sb.append(c);
//            }
//        }
//
//        System.out.println(sb.toString().length());
//        String result = Java1152.solution(s);
//        int resultCount = Java1152.countStr(result);
    }

//    public static String solution(String word){
//        if (word == null || word.isBlank()) return word;  // 문자열이 null이거나 공백인지 확인
//
//        StringBuilder sb = new StringBuilder();
//        Set<Character> set = new HashSet<>();  // 중복을 허용하지 않는 자료구조
//
//        for(char c : word.toCharArray()){
//            if (set.add(c)){  // HashSet에 문자를 추가하려고 시도하는데 set에 존재한다면 false, 없다면 true로 반환
//                sb.append(c);  // HashSet에 존재하지 않는 문자(Hashset이 true)를 가변변수 sb에 추가
//            }
//        }
//        return sb.toString();
//    }
//
//    public static int countStr(String word) {
//        return word.length();
//    }
}
