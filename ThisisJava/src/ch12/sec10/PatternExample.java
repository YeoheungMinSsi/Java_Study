package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String rexExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-2321-1124";

        boolean result = Pattern.matches(rexExp, data);
        if(result){
            System.out.println("정규식과 일치함");
        }else{
            System.out.println("정규식과 일치하지 않음");
        }

        rexExp = "\\w+@\\w+\\.\\w+(\\.\\w)?";
        data = "anatano@root.com";
        result = Pattern.matches(rexExp, data);
        if(result){
            System.out.println("정규식과 일치함");
        }else{
            System.out.println("정규식과 일치하지 않음");
        }

    }
}
