import static java.lang.System.out;
import java.util.Arrays;

public class ExchangeSort {
    public static void main(String[] args){
        int[] array = {12, 326, 127, 467, 110, 58};

        array = ExchangeSort(array);
        out.print(Arrays.toString(array));
    }

    // 작은 값부터 앞으로
    public static int[] ExchangeSort(int[] array){
        int i, j;
        int temp;
        int numLength = 6;
        for(i = 0; i < numLength; i++){
            for(j = i+1; j < numLength; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    // 큰 값부터 앞으로
//    public static int[] ExchangeSort(int[] array){
//        int i, j;
//        int temp;
//        int numLength = 6;
//        for(i = 0; i < numLength; i++){
//            for(j = i+1; j < numLength; j++){
//                if(array[i] < array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        return array;
//    }

}
