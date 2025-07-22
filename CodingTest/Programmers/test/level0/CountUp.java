import java.util.ArrayList;
import java.util.Arrays;

public class CountUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }

    public static int[] solution(int st_num, int ed_num) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = st_num; i <= ed_num; i++) {
            result.add(i);
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }


        return answer;

    }
}
