import java.util.Scanner;

public class Test43p_5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][30];
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("학번을 입력해주세요 : ");
        num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[0][i] == num){
                System.out.printf("%d의 학점은 %d 입니다.", num, arr[1][i]);
                break;
            }else{
                continue;
            }
        }

    }
}
