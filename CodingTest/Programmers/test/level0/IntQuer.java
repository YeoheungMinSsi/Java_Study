public class IntQuer {
    public static void main(String[] args) {
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for(int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int n = arr[a];
            arr[a] = arr[b];
            arr[b] = a;
        }

        return answer = arr;

    }

}
