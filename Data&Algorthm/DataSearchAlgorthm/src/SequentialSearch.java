import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] dataArray = {4, 21, 2, 10, 11, 16};
        System.out.println("검색할 데이터를 입력하세요");

        Scanner sc = new Scanner(System.in);
        // 데이터 입력 / trim은 공백제거
        int search = Integer.parseInt(sc.nextLine().trim());
        int result = sequentialSearch(dataArray, search);

        if(result == -1)
            System.out.println("데이터를 찾지 못했습니다.");
        else
            System.out.println("데이터의 위치는 " + result + "번째 입니다.");

        sc.close();
    }

    public static int sequentialSearch(int[] arr, int search){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search)
                return i;
        }
        return -1;
    }
}
