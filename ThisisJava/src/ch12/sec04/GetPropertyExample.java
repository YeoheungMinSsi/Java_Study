package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        // 운영체제와 사용자 정보 출력
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println("OS Name : " + osName);
        System.out.println("user Name : " + userName);
        System.out.println("user Home : " + userHome);

        // 전체 키와 값을 출력
        System.out.println("------------------------");
        System.out.println("key                                     : value");
        System.out.println("------------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();
        for (Object objKey : keys) {
            String key = (String) objKey;
            String value = props.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }


    }

}
