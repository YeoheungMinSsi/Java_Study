public class Operator {
    public static void main(String[] args) {
//        byte a = 100;
//        byte b = -a;  // - 연산자를 사용함으로서 연산을 하게 됨
        // 따라서 자도 형 변환을 통해서 -a는 int형이 적용됨

//        byte c = 100;
//        int d = -c;
//        byte e = (byte) -c;
//        System.out.println("d = "+d);
//        System.out.println("e = "+e);

//        int a = 2147483647;
//        System.out.println(a + 1);

//        int a = 1;
//        double b = 0.1;
//        int c = 7;
//
//        double result = a - b*c;
//
//        System.out.println(result);

//        int a = 1;
//        int b = a*10;
//        int c = 7;
//
//        System.out.println((b - c) / 10.0);
//        System.out.println((b - c) / (double)10);

        int result = 1 << 3;  // 1 * 2^3이 수행이 되서 1 * 8 즉, 8이 입력됨

        int result1 = -8 >> 3; // -8 / 2^3이 수행되어 -8 / 8이 수행되며 -1이 대입됨
        System.out.println(result);
        System.out.println(result1);
    }
}
