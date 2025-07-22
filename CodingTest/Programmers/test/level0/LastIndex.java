import java.util.ArrayList;
import java.util.Arrays;

public class LastIndex {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 6}).length);
//        System.out.println(new int[]{2, 1, 6}.length);
    }
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }

        if(num_list.length > 1){
            if(num_list[num_list.length-1] > num_list[num_list.length-2]){
                answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
            }else{
                answer[num_list.length] = num_list[num_list.length-1] * 2;
            }
        }
        return answer;

    }

}
