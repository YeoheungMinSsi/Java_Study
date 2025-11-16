package FactoryPattern.homework2;

public class NotifierFactory {
    public Notifier getNotifier(String message){
        Notifier notifier = null;

        if(message.equals("sms")){
            notifier = new SMSNotifier();
        } else if(message.equals("slack")){
            notifier = new SlackNotifier();
        } else if(message.equals("email")){
            notifier = new EmailNotifier();
        }

        return notifier;
    }
}
