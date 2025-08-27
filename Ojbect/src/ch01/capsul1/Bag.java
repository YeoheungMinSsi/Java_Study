package ch01.capsul1;

// note: 관람객이 가지고 오는 소지품을 보관하는 가장
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // note: 이벤트 당첨(관람권, 티겟)이 안된 사람이 있음 -> 현금,초대장 보관 or 현금만 보관
    // 강제 제약을 위한 생성자
    // 현금만 존재
    public Bag(long amount){
        this(null, amount);
    }
    //현금과 초대권 존재
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }


    // 초대장 보유 여부, 가지고 있다면 true, 없다면 false
    public boolean hasInvitation(){
        return invitation != null;
    }

    // 티겟 보유 여부, 위와 동일
    public boolean hasTicket(){
        return ticket != null;
    }

    // 초대장 티겟 교환 메소드
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    // 현금 증감 메서드
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
