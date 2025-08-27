package ch01.Ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    // note: getter
    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }
}
