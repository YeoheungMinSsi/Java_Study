package ch01.capsul1;

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

    // note: Audience 캡슐화 개선, Bag에 접근하는 모든 로직을 Audience 내부로 감추기 위해
    // note: buy 메서드 추가, TicketSeller의 sellTo 메서드에 getBag 메서드에
    // note: 접근하는 부분을 byu 메서드로 옮김
    public Long buy(Ticket ticket){
        if(bag.hasInvitation()){  // 가방에 초대권이 있다면
            bag.setTicket(ticket);  // 가방에 티겟 리스트에서 빼온 티겟을 준비
            return 0L;  // 티켓값이 없으니 0으로 반환
        }else{
            bag.setTicket(ticket);  // 가방에 티겟이 없어 일단 리스트에서 티겟을 빼와 준비
            bag.minusAmount(ticket.getFee());  // 가방에서 티켓 값만큼 돈 감소
            return ticket.getFee();  // 티켓값을 반환(구매 메서드기 때문)
        }
    }

}
