import java.util.*;

public class Java2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int num = 0; num < M; num++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int n = i -1; n < j; n++){
                arr[n] = k;
            }
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}