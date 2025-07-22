import java.util.Scanner;

public class Java5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];  // 반 인원 30명

        for(int i = 0; i < 28; i++){  // 30번을 반복함
            int j = sc.nextInt();  // 입력값을 입력하도록 함
            arr[j-1] = 1;  // 입력한 인덱스에 1을 입력함
        }
        for(int i = 0; i < 30; i++){  // 30번을 반복
            if(arr[i] != 1){  // 입력했던 인덱스가 1이 아니라면 조건문 사용
                System.out.printf("%d\n", (i + 1));  // 1이 아니라면 위치값 출력
            }
        }

    }
}