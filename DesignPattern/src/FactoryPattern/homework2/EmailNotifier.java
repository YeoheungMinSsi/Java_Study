package FactoryPattern.homework2;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("Email 알림 : " + message);
    }
}
