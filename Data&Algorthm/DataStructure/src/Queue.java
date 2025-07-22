import java.util.*;

public class Queue {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();

        // 큐에 저장
        ls.offer("홍길동");
        ls.offer("한바다");
        ls.offer("이강산");
        ls.offer("김하늘");

        System.out.println("Size, not pull : " + ls.size());

        // 읽는 값이 존재하는가? -> 존재하지 않을때 동안
        while(ls.peek() != null)
            System.out.println(ls.poll());  // 값을 읽어서 출력

        System.out.println("Size : " + ls.size());
    }
}
