package ch01.capsul3;

// note: 관람객이 가지고 오는 소지품을 보관하는 가장
// note: 수정3 - Bag은 Audience가 조종하는 객체 => Bag을 자율적인 존재로
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{  // 가방에 초대장이 없다면
            setTicket(ticket);
            minusAmount(ticket.getFee());  // 지갑에서 가격만큼 감소
            return ticket.getFee();  // 가방 객체를 사용한 것이 가격을 확인할 수 있도록 리턴
        }
    }

    // note: 내부에서만 사용하기에 접근 제한을 private로 수정

    // 초대장 티겟 교환 메소드
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 초대장 보유 여부, 가지고 있다면 true, 없다면 false
    private boolean hasInvitation(){
        return invitation != null;
    }

    // 현금 증감 메서드 - 이때는 가격이 증가될 이유 없음
    // note: 내부에서만 사용하기에 접근 제한을 private로 수정
    private void minusAmount(Long amount){
        this.amount -= amount;
    }
}
