public class StringMul {
    public static void main(String[] args) {
        String myString = "love";
        int k = 3;
        System.out.println(solution(myString, k));
    }
    public static String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i < k; i ++){
            answer += my_string;
        }
        return answer;
    }
}
