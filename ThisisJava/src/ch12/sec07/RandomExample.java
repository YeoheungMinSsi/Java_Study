package ch12.sec07;

import java.util.Random;
import java.util.Arrays;

// note : 간단한 복권 번호 만들기
public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);  // 선택번호를 얻기 위한 Random 객체 생성
        System.out.print("선택번호 : ");
        for(int i = 0; i < selectNumber.length; i++) {
            // 1에서 45까지의 수 중에서 랜덤 수 선택
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨번호
        int[] winnerNumber = new int[6];
        random = new Random(5);  // 당첨번호를 얻기위한 Random 객체 생성
        System.out.print("당첨번호 : ");
        for(int i = 0; i < winnerNumber.length; i++) {
            winnerNumber[i] = random.nextInt(45) + 1;
            System.out.print(winnerNumber[i] + " ");
        }
        System.out.println();

        // 당첨 여부
        Arrays.sort(selectNumber);
        Arrays.sort(winnerNumber);  // 비교전 배열 값 정렬
        boolean result = Arrays.equals(selectNumber, winnerNumber);  // 배열항목 비교
        System.out.print("당첨여부 : " );
        if(result){
            System.out.println("1등에 당첨");
        }else{
            System.out.println("당첨되지 않음");
        }
    }
}
