package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("[&,]");  // split("[ | ,") 와 동일함
        for(String token : arr){
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수진/김사향";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
