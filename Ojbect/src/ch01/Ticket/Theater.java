package ch01.Ticket;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
//        // 초대장 존재시 getTicket을 통해 Ticket 리스트의 첫 티겟을 제거하고 그 티켓을 ticket 변수에 할당
//        // 가방에 setTicket을 통해 할당받은 ticket을 저장
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            // 초대장이 없다면 티켓 리스트의 첫 티켓을 제거후 해당 티켓을 ticket 변수에 저장
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());  // 관람객의 가방에서 돈을 티켓의 가격만큼 제거
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());  // TicketOffice는 관램객이 티켓을 샀으니 티켓가격만큼 증가
            audience.getBag().setTicket(ticket);  // ticket을 구매했으니 관람객의 가방에 티켓 추가
        }
    }

}
