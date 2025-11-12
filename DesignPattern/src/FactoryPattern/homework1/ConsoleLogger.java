package FactoryPattern.homework1;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message){
        System.out.println("콘솔로그: " + message);
    }
}
