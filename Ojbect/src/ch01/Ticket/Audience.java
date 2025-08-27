package ch01.Ticket;

// note: 관람객 구현
public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    // note: getter 매서드, Audience를 객체 내부의 bag에 직접 접근하지 않고
    // note: 정해진 메서드를 통해서 접근 가능
    public Bag getBag(){
        return bag;
    }
}
