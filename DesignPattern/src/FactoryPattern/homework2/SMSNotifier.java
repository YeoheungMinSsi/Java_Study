package FactoryPattern.homework2;

public class SMSNotifier implements Notifier {
    public void send(String message){
        System.out.println("SMS 알림 : " + message);
    }
}
