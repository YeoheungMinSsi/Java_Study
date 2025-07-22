import java.util.HashMap;
import java.util.Map;

public class NumControl {
    public static void main(String[] args) {

    }
    public static int solution(int n, String control) {
        int answer = 0;

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
        Map<Character, Integer> map = new HashMap<>();

        map.put('w', 1);
        map.put('s', -1);
        map.put('d', 10);
        map.put('a', -10);

        for(char c : control.toCharArray()) {
            if(map.containsKey(c)) {
                n += map.get(c);
            }
        }



        return answer = n;
    }
}
