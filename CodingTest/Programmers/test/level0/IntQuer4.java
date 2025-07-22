import java.util.ArrayList;
import java.util.Arrays;

public class IntQuer4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
    }

    public static int[] solution(int l, int r) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean flag = true;
            for(char c : s.toCharArray()) {
                if(c != '0' && c != '5'){
                    flag = false;
                }
            }
            if(flag){
                result.add(i);
            }

        }
        if(result.isEmpty()){
            result.add(-1);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
