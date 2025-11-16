package FactoryPattern.homework2;

public class SlackNotifier implements Notifier {
    public void send(String message){
        System.out.println("Slack 알림 : " + message);
    }
}
