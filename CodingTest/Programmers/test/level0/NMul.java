public class NMul {
    public static void main(String[] args) {
        System.out.println(solution(98, 2));
    }
    public static int solution(int num, int n){
        int answer = 0;

        answer = ((num % n == 0) ? 1 : 0);

        return answer;
    }
}
