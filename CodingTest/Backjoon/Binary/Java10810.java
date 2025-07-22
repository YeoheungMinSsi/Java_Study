import java.util.Scanner;

public class Java10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrIndex = 0, max = 0;
        int[] m = new int[9];

        for(int i = 0; i < m.length; i++){
            m[i] = sc.nextInt();
            if(max < m[i]){
                max = m[i];
                arrIndex = i;
            }
        }

        System.out.printf("%d\n", max);
        System.out.println(arrIndex + 1);
    }
}