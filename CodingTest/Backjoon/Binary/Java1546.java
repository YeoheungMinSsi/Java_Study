import java.util.Scanner;

public class Java1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 시험 본 과목의 수
        double[] arr = new double[N];
        double M = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();  // 배열에 값을 넣음
            M = Math.max(arr[i], M);  // 최댓값 구하기
        }
        for ( int i = 0; i < N; i++) {
            arr[i] = arr[i] / M * 100;  // 점수 / M * 100 대입
            sum += arr[i];
        }

        sc.close();
        System.out.print(sum / N);
    }
}