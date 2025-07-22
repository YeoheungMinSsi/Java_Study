import java.util.Arrays;

public class IntQuer2 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 4, 3};
        int[][] b = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        System.out.println(solution(a, b));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for(int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];

            for(int j = a; j <= b; j++) {
                if(j <= arr.length && arr[j] > c) {
                    answer[i] = (answer[i] == -1 ? arr[j] : Math.min(answer[i], arr[j]));
                }
            }

        }
        return answer;
    }

}
