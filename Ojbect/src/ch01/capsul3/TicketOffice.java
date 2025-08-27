package ch01.capsul3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// note: 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관하는 클래스
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }

    // note: getTicket과 plusAmount는 내부에서만 실행하기에 private로 수정
    private Ticket getTicket(){
        return tickets.remove(0);  // removeFirst()로 변경가능
    }

    // 환불이 없기에 minus는 제거
    private void plusAmount(Long amount){
        this.amount += amount;
    }
}
