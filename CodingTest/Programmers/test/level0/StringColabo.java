public class StringColabo {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));

    }

    public static String solution(String str1, String str2) {
//        StringBuilder answer = new StringBuilder();
        String answer = "";

        for(int i = 0; i < str1.length(); i++) {
//            answer.append(str1.charAt(i));
//            answer.append(str2.charAt(i));

//            answer += str1.charAt(i);
//            answer += str2.charAt(i);

//            answer += str1.substring(i, i+1);
//            answer += str2.substring(i, i+1);

            answer = answer + str1.substring(i, i+1) + str2.substring(i, i+1);
        }

//        return answer.toString();
        return answer;
    }
}
