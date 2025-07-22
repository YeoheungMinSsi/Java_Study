import java.util.*;

public class Java10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 바구니 개수
        int M = sc.nextInt();  // 공바꾸는 횟수
        int[] arr = new int[N];  // 공넣을 바구니


        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;  // 각 바구니에 바구니 순서에 해당하는 번호의 공을 넣음
        }  // 처음 공 바구니에 공 순서 입력하는 로직
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < M; i++) {
            int j = sc.nextInt();  // 바꿀려는 공의 번호 1
            int k = sc.nextInt();  // 바꿀려는 공의 번호 2
            int spa = 0;  // 공을 바꾸기 위한 공간
            spa = arr[j-1];
            arr[j-1] = arr[k-1];
            arr[k-1] = spa;
            // System.out.printf("%d번째 배열", i);
            // System.out.println(Arrays.toString(arr));
        }
        sc.close();
        for(int i = 0; i < N; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}