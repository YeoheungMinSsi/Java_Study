package ch01.capsul2;

// note: Audience 인터페이스만 의존하도록 수정 -> buy 메서드를 호추랗도록 코드 변경
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

}
