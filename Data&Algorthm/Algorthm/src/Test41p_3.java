public class Test41p_3 {
    public static void main(String[] args) {
        int sum = 0;
        int flag = 0;

        for(int i = 1; i <= 100; i++){
            if(flag == 0){
                sum += i;
                flag = 1;
            }else if(flag == 1){
                sum -= i;
                flag = 0;
            }
        }
        System.out.println(sum);
    }
}
