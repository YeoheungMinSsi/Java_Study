import java.util.Scanner;

public class Test42p_4 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int total = 0;
        int avg = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 정수 값을 입력하세요: ", i+1);
            int num = sc.nextInt();
            Integer num2 = num;
            if(num2.getClass().getName() == "java.lang.Integer"){
                arr[i] = num;
                total += num;
            }else{
                i -= 1;
            }
        }
        avg = total / arr.length;
        System.out.println(avg);
    }
}
