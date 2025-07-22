public class CharListToString {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        System.out.println(soulution(a));
    }

    public static String soulution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            for(char c : arr[i].toCharArray()) {
                answer += c;
            }
        }

        return answer;
    }
}
