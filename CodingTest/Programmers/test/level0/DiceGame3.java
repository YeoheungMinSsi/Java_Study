import java.util.Arrays;

public class DiceGame3 {
    public static void main(String[] args) {
        System.out.println(solution(4, 1,4, 4));
    }
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;

        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 배열 중복 확인
        int[] dice_distinct = Arrays.stream(dice).distinct().toArray();
        // 배열 길이 확인
        int dice_length = dice_distinct.length;

        if(dice_length == 1) {
            answer = 1111 * dice[0];

        }else if(dice_length == 2){
            if (dice[0] == dice[2] || dice[1] == dice[3]){
                answer = (int)Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2);
            }
            else if(dice[0] == dice[1] && dice[2] == dice[3]){
                answer = (dice[0] + dice[2]) * Math.abs(dice[1] - dice[2]);
            }
        }else if(dice_length == 3){
            if (dice[0] == dice[1] && dice[2] != dice[3]){
                answer = dice[2] * dice[3];
            }else if(dice[1] == dice[2] && dice[3] != dice[0]){
                answer = dice[3] * dice[0];
            }else if(dice[2] == dice[3] && dice[1] != dice[0]){
                answer = dice[1] * dice[0];
            }else if(dice[3] == dice[0] && dice[1] != dice[2]){
                answer = dice[1] * dice[2];
            }
        }else if(dice_length == 4){
            answer = dice[0];
        }
//        System.out.println(Arrays.toString(dice));
        return answer;
    }
}
