import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("검색할 데이터를 입력하세요");

        Scanner sc = new Scanner(System.in);

        int search = Integer.parseInt(sc.nextLine().trim());

        binarySearch(dataArray, search);

        sc.close();
        return;
    }

    public static void binarySearch(int[] arr, int iKey){
        int mid;
        int left = 0;  // 배열의 처음
        int right = arr.length - 1;  // 배열의 끝

        while(right >= left) {
            mid = (right + left) / 2;
            if (iKey == arr[mid]) {
                System.out.println("찾는 값은 " + iKey + "는 " + mid + "번째 인덱스에 존재합니다.");
                break;
            }

            if (iKey < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
