package FactoryPattern.homework1;

public class TestLogger implements Logger {
    @Override
    public void log(String message){
        System.out.println("테스트로그: " + message);
    }
}
