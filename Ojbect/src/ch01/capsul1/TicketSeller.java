package ch01.capsul1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }


    public void sellTo(Audience audience){
//         ticketSeller안에 옮겼기 때문에 ticketSeller 제거 및
//         ticketOffice를 직접사용하기에 변수 ticketOffice로 변경
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            // 초대장이 없다면 티켓 리스트의 첫 티켓을 제거후 해당 티켓을 ticket 변수에 저장
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());  // 관람객의 가방에서 돈을 티켓의 가격만큼 제거
            ticketOffice.plusAmount(ticket.getFee());  // TicketOffice는 관램객이 티켓을 샀으니 티켓가격만큼 증가
            audience.getBag().setTicket(ticket);  // ticket을 구매했으니 관람객의 가방에 티켓 추가

        }
    }
}
