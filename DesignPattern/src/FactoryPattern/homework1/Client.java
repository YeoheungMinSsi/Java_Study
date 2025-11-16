package FactoryPattern.homework1;

import java.util.Scanner;

public class Client {
//    static String file_env = "file";
//    static String cloud_env = "cloud";
//    static String console_env = "console";

    static String console = """
            =========================================
            환경을 입력해주세요
            """;

    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println(console);

        String env = sc.nextLine().toLowerCase();
        Logger logger = factory.getLogger(env);
//        Logger logger_cloud = factory.getLogger(file_env);
//        Logger logger_cloud = factory.getLogger(cloud_env);
//        Logger logger_console = factory.getLogger(console_env);

        if (logger != null) {
            System.out.println("환경 설정 값 : " + env + " 획득");

            logger.log("사용자 접속");
        } else {
            System.out.println("오류 발생 : " + env + "환경 설정을 가지고 오지 못했습니다.\n해당 환경이 없을 수 있습니다.");
        }
        sc.close();
    }
}
