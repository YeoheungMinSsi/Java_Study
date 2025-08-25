package ch06.sec08.exam02;

public class Computer {
    int sum(int ... values){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < values.length; i++){
            sum1 += values[i];
        }

        for(int value : values){
            sum2 += value;
        }

        return sum2;
    }
}
