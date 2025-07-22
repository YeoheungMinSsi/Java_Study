public class LinearList {
    public static void main(String[] args) {
        int sale[] = new int [] {12, 45, 67, 43, 56, 98};  // 리스트 구조 선언

        for(int i = 0; i < sale.length; i++) {
            System.out.printf("%d번째 sale 결과 : ", i+1);  // 리스트 구조의 출력
            System.out.println(sale[i]);
        }
    }
}
