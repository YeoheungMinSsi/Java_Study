import java.util.ArrayList;

public class Array4 {
    public static void main(String[] args) {
//        System.out.println(solution(10));
    }
    public static int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        while(i<arr.length){
            if(result.isEmpty())
            {
                result.add(arr[i]);
                i++;
            }
            else
            {
                if(result.get(result.size() - 1) < arr[i])
                {
                    result.add(arr[i]);
                    i++;
                }
                else if(result.get(result.size() - 1) >= arr[i])
                {
                    result.remove(result.size() - 1);
                }
            }
        }
        int[] answer = new int[result.size()];

        for(int j = 0; j < result.size(); j++){
            answer[j] = result.get(j);
        }
        return answer;
    }
}
