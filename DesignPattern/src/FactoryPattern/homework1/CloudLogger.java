package FactoryPattern.homework1;

public class CloudLogger implements Logger {
    @Override
    public void log(String message){
        System.out.println("클라우드로그: " + message);
    }
}
