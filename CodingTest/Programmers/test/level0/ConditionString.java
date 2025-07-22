public class ConditionString {
    public static void main(String[] args) {
        System.out.println("solution");
    }
    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")){
            if(eq.equals("=")){
                answer = (n >= m ? 1 : 0);
            }else if (eq.equals("!")){
                answer = (n > m ? 1 : 0);
            }

        }else if (ineq.equals("<")){
            if(eq.equals("=")){
                answer = (n <= m ? 1 : 0);
            }else if(eq.equals("!")){
                answer = (n < m ? 1 : 0);
            }
        }

//        return answer = ineq.equals(">")
//                ? (eq.equals("=") ? (n >= m ? 1 : 0) : (n > m ? 1 : 0))
//                : (eq.equals("=") ? (n <= m ? 1 : 0) : (n < m ? 1 : 0));

        return answer;
    }
}
