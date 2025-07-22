public class Test2 {
    public static void main(String[] args) {
//        char i = 30;
//        char j = 35;
//
////        char k = (i + j);
////        System.out.println(k);
//        char n = (char)(i + j);
//        System.out.println(n);
//
//        long a = 10;
//        long b = 20;
//        long c = a + b;
//        System.out.println(c);
//
//        float d = 10.1f;
//        float e = 1.5f;
//        float f = d + e;
//        System.out.println(f);
//        float a = 1.2f;
//        double b = 3.4;
//        double c = a + b;
//        System.out.println(c);

//        short a = 5;
//        double b = 1.5;
//        double c = a + b;
//        System.out.println(c);

//        short a = 5;
//        double b = 1.5;
//        int c = a + (int)b;
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        double c = a / b;
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        double c = (double) a / b;
//        double d = a / (double) b;
//        double e = (double) (a / b);
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

//        int value = 2;
//        String result = value + "1";
//        System.out.println(result);
//        String result = 1 + "1";
//        System.out.println(result);
// 앞의 정수 1일 문자열 "1"로 변환되어 11이 출력됨
//        String result = "1" + 1;
// 뒤의 정수 1일 문자열 "1"로 변환되어 11이 출력됨
//        String result = 1 + 1;
//오류가 발생
//        int value = 2;
//        String result = value + 1 + "3";
//        System.out.println(result);
// 위 피연산자들을 계산하면 앞에서 value(2) 와 1을 덧셈하여 3이 먼저 계산
// 이후 3과 "3"이 계산되어 정수 3이 문자열로 자동 타입 변환되고 "3" + "3" 이 되어 "33"이 반환

//        int value = 2;
//        String result = 1 + "3" + value;
//        System.out.println(result);
// 1 + "3"이 먼저 연산되어 정수 1이 자동 타입 변환이 이루어져 "1"+"3", 즉 "13"이 반환
// 이후 "13"과 value(3)이 연산되는데 value 값도 자동 타입 변환이 되어 "13"+"3"이 연산
// 값이 "133"이 반환됨

//        int value = 2;
//        String result = "3" + (1 + value);
//        System.out.println(result);
// 만약 괄호가 없다면 "3"+"1"이 연산이 되는데 괄호를 통해서 우선순위를 지정했기 때문에
// 괄호 먼저 연산이 되어 (1 + value(2))이 연산 결과가 3이 되고 이후 "3" + 3이 연산되어
// "3" + "3" 즉 "33"이 반환 됨

//        System.out.printf("이름 : %s, 나이 : %d", "민지홍", 22);
// 이름 : 민지홍, 나이 : 25 이 출력됨

//        int a = 14;
//        int b = 14;
//        boolean c = a == b;
//        System.out.println(c);
        String a = "한국";
        String b = "한국";
        boolean c = a.equals(b);
        System.out.println(c);
    }
}
