public class DiceGame2 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
    }
    public static int solution(int a, int b, int c) {
        int answer = 0;

        int sum = a + b + c;
        int sqrt = (int) (sum * (getSquare(a) + getSquare(b) + getSquare(c)));
        int pow = (int) (getCube(a) + getCube(b) + getCube(c));

//        if (a == b && b == c){
//            answer = (int) sqrt * pow;
//        }
//        else if(a == b || a == c || b == c){
//            answer = sqrt;
//        }
//        else {
//            answer = a + b + c;
//        }

        answer = (a == b && b == c) ? sqrt * pow : ((a == b || a == c || b == c) ? sqrt : sum);

        return answer;
    }

    public static int getSquare(int a){
        return a * a;
    }

    public static int getCube(int a){
        return a * a * a;
    }
}
