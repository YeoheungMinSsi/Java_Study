import java.util.*;

public class Java3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();  // HashSet 선언 / set 변수로 사용

        int[] arr = new int[10];

        for(int i = 0; i < 10; i ++){
            int j = sc.nextInt();
            arr[i] = j;
        }
        sc.close();
        for(int i = 0; i < 10; i ++){
            if(arr[i] % 42 != 0){
                set.add(arr[i] % 42);  // add 매서드를 사용해서 set 변수에 값을 넣음(변수내에서 중복값제거)
            } else {
                set.add(arr[i] % 42);
            }
        }
        int sum = 0;
        sum = set.size();
        System.out.println(sum);
    }
}