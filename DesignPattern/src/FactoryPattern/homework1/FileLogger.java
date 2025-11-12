package FactoryPattern.homework1;

public class FileLogger implements Logger {

    @Override
    public void log(String message){
        System.out.println("파일로그: " + message);
    }
}
