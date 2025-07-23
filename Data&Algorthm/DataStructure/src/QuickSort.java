import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args){
        Integer[] arr = {30, 50, 7, 40, 88, 15, 44, 55, 22,
                33, 77, 99, 11, 66, 1, 85};

        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.addAll(Arrays.asList(arr));

        aList = (ArrayList<Integer>) quicksort(aList);
        System.out.print(aList.toString());
    }

    public static <T extends Comparable<? super T>> List<T> quicksort(List<T> list){
        if(list.size() <= 1) return list;

        int pivot = list.size() / 2;  // 기준이 되는 값(해당 값으로 나눔)

        List<T> a = new ArrayList<T>();  // lesser
        List<T> b = new ArrayList<T>();  // greater

        int c = 0; // same

        for( T number : list){
            if (list.get(pivot).compareTo(number) < 0)
                // 피벗 기준 값이 현재 number보다 작을 때(피벗보다 값이 클때 b리스트에 추가
                b.add(number);
            else if (list.get(pivot).compareTo(number) > 0)
                // 피벗 기준 값이 현재 number보다 클때(피벗보다 값이 작을 때 a리스트에 추가
                a.add(number);
            else
                // 피벗과 값이 같을 떄 C 카운터 증가
                c++;
        }

        // 재귀 호출, 피벗을 기준으로 낮은 값을 저장한 a에 다시 퀵 정렬
        a = quicksort(a);
        // 피벗과 같은 값을 위에서 for/if문을 통해 c를 증가시켜 c만큼 a에 pivot 값을 추가
        for (int i = 0; i < c; i++)
            a.add(list.get(pivot));

        b = quicksort(b);

        // 정렬된 a,b 리스트를 sorted 리스트로 추가하기 위해 리스트 생성
        List<T> sorted = new ArrayList<T>();
        // sorted 리스트에 a,b 리스트 추가 후 해당 리스트 반환
        sorted.addAll(a);
        sorted.addAll(b);
        return sorted;
    }
}
