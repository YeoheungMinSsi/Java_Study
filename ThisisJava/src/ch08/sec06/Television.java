package ch08.sec06;

public class Television implements RemoteControl {
    // 필드
    private int volume;

    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn(){
        System.out.println("Tv를 켬");
    }
    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOff(){
        System.out.println("Tv를 끔");
    }
    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void setVolume(int volume){
        if(volume > MAX_VOLUME){
            this.volume = MAX_VOLUME;
        }else if(volume < MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
}
