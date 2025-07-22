public class IntList {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 7, 8, 3}));
        System.out.println();
    }
    public static int solution(int[] num_list) {
        int answer = 0;

        int sum = 0;
        int mul = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }

//        return answer = num_list[3];
//        return answer = (int) Math.pow(sum, 2);
        return answer = (mul < (int) Math.pow(sum, 2) ? 1 : 0);
    }
}
