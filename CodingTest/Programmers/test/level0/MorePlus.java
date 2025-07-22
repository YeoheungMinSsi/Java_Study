public class MorePlus {
    public static void main(String[] args) {

        System.out.println(plusNum(4, 53));
    }
    public static int plusNum(int a, int b) {
        int answer = 0;

        int result_ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result_ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        return answer = Math.max(result_ab, result_ba);
    }
}
