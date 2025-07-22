public class ArchimeticPluz {
    public static void main(String[] args) {
        boolean[] in = new boolean[] {true, false, false, true, true};
        System.out.println(solution(3, 4, in));

    }
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++) {
//            aArr[i] = a + d * i;
//            if(included[i]) {
//                answer += aArr[i];
//            }
            if(included[i]) {
                answer += a + d * i;
            }
        }


        return answer;
    }
}
