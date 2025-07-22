import java.util.*;
public class Stack {
    public static void main(String[] args) {
        // TODO Auto-generated java. slub
        java.util.Stack<Integer> s = new java.util.Stack<Integer>();

        System.out.println("Stack create");

        for(int i = 0; i < 10; i++) s.push(new Integer(i));

        System.out.println("Stack top, not pop : " + s.peek());  // 현재 스택의 위치 확인

        System.out.println("1pop : " + s.pop());  // stack 값 빼기
        System.out.println("2pop : " + s.pop());
        System.out.println("3pop : " + s.pop());
        System.out.println("4pop : " + s.pop());

        System.out.println("Stack top : " + s.peek());  // 현재 스택의 위치 확인
    }
}
