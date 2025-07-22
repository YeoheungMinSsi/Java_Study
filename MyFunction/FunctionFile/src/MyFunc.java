public class MyFunc {

    public static void main(String[] args) {
        int value_a = 10;
        int value_b = 20;
        exchangeValue(value_a, value_b);
        System.out.println("value_a: " + value_a);
        System.out.println("value_b: " + value_b);
    }

    public static void exchangeValue(int a, int b){
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
    }
}
