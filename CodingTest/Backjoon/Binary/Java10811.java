import java.util.Scanner;

public class Java10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 총 바구니 순서
        int M = sc.nextInt();  // 바구니를 역순으로 만드는 갯수
        int[] arr = new int[N]; //
        int term = 0;

        for(int i = 0; i < N; i++){  // 바구니 배열에 바구니 순서 1번부터 N번까지 1부터 N까지 입력
            arr[i] = i + 1;  // 첫 인덱스 0번에 1을 더해서 넣어 1 부터라는 것을 입력
        }

        for(int k = 0; k < M; k++){  // M번 반복하기
            int i = sc.nextInt() - 1;  // 첫 배열 순서 입력
            int j = sc.nextInt() - 1;  // 마지막 배열 순서 입력

            while( i < j){
                term = arr[i];
                arr[i] = arr[j];
                arr[j] = term;
                i++;
                j--;
            }
        }
        sc.close();

        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}