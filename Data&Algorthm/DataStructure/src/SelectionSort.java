//import static java.lang.System.out;
//import java.util.Arrays;
//
//public class SelectionSort {
//    public static void main(String[] args) {
//        int[] arr = {10, 45, 67, 43, 56, 98};
//        arr = sSort(arr);
//        out.print(Arrays.toString(arr));
//    }
//
//    public static int[] sSort(int[] arr){
//        int temp = 0;
//        int[] tmpArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            temp  = arr[i];
//            for(int j = i; j < arr.length; j++){
//                if(temp > arr[j]){  // j위치가 작을 때
//                    temp = arr[j];
//                    arr[j] = arr[i];  // arr[i]가 arr[j]보다 크기에 대입
//                    arr[i] = temp;  // arr[j]자리(작은 값)을 temp넣어서 다시 arr[i]에 대입
//                }
//            }
//        }
//        tmpArr = arr;
//        return tmpArr;
//    }
//}

import static java.lang.System.out;
import java.util.Arrays;

public class SelectionSort{
    public static void  main(String[] args){
        int[] array = {12, 326, 127, 467, 110, 58};
        int size = 6;
        array = SelectionSort(array, size);
        out.print(Arrays.toString(array));
    }

    public static int[] SelectionSort(int arr[], int Max){
        int i, j;
        int min, temp;
        for(i=0; i<Max-1; i++){
            min = i;
            for(j=i+1; j<Max; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
