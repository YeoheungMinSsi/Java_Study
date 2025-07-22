public class Connection {
    public static void main(String[] args) {

    }
    public static int solution(int[] num_list) {
        int answer = 0;

        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += String.valueOf(num_list[i]);
            }else{
                odd += String.valueOf(num_list[i]);
            }
        }

        return answer = Integer.parseInt(odd) + Integer.parseInt(even);
    }
}
