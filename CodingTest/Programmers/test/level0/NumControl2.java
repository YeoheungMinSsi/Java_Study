import java.util.HashMap;
import java.util.Map;

public class NumControl2 {
    public static void main(String[] args) {

    }
    public static String solution(int[] numLog) {
        String answer = "";

//        for( int i = 0; i < control.length(); i++ ) {
//
//            switch( control.charAt(i) ) {
//                case 'w':
//                    n += 1;
//                    break;
//                case 's':
//                    n -= 1;
//                    break;
//                case 'd':
//                    n += 10;
//                    break;
//                case 'a':
//                    n -= 10;
//                    break;
//                default:
//                    break;
//            }
//        }

        // HashMap을 사용하는 경우
//        Map<Character, Integer> map = new HashMap<>();
//
//        map.put('w', 1);
//        map.put('s', -1);
//        map.put('d', 10);
//        map.put('a', -10);

        for(int i = 1; i < numLog.length; i++) {
            if(numLog[i] - numLog[i-1] == 1) answer += "w";
            else if(numLog[i] - numLog[i-1] == -1) answer += "s";
            else if(numLog[i] - numLog[i-1] == 10) answer += "d";
            else if(numLog[i] - numLog[i-1] == -10) answer += "a";
        }



        return answer;
    }
}
