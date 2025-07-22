import java.util.ArrayList;
import java.util.Arrays;

public class Collatz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(45)));
    }
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            if(n % 2 == 0){
                list.add(n);
                n = n / 2;
            }else if(n % 2 == 1){
                list.add(n);
                n = 3 * n + 1;
            }
            if(n == 1){
                list.add(n);
                break;
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;

    }
}
