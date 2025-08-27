package ch01.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// note: 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관하는 클래스
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    // note: 생성자를 통해 티켓 클래스를 변수로 할당받은 것을 배열 형식으로 매개변수로 전달
    public TicketOffice(Long amount, Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
        // 전달받은 tickets 배열의 모든 Tickets 객체(매개변수)를 ticket 리스트 추가
    }

    // 티겟 컬렉션에서 맨 첫 위치에 저장된 Ticket을 반환하는 것으로 구현
    public Ticket getTicket(){
        return tickets.remove(0);  // removeFirst()로 변경가능
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
