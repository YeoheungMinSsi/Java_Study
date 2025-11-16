package FactoryPattern.homework2;

//import java.util.Scanner;

public class Client {

    private static final String CHANNEL_SETTING = "sms";
    public static void main(String[] args){
        NotifierFactory factory = new NotifierFactory();
//        Scanner sc = new Scanner(System.in);
        try{
            Notifier notifier = factory.getNotifier(CHANNEL_SETTING);
            notifier.send("Hello World");
        }catch(IllegalArgumentException e){
            System.out.println("오류 - 유효하지 않은 오류 입니다. " + e.getMessage());
        }

    }

}
