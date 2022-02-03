package Project;

public class Source {
    public static void printTicketDetails(Ticket ticket){
     System.out.println("Ticket Detail : (PNR No : " + ticket.getPnr() + ")");
    }
    public static void main(String[] args){


        //TouristTicket touristTicket = new TouristTicket();
        Flight flight = new Flight("121","Indigo", 200, 150);


        Passenger passenger1 = new Passenger(1,"Nerul","Mumbai","Maharashtra","Shubhangi","8879700665","user@gmail.com");
        Passenger passenger2 = new Passenger(2,"Nerul","Mumbai","Maharashtra","Pradip","8879700665","user1@gmail.com");

        RegularTicket regularTicket = new RegularTicket("rt1","Mumbai","Delli","02-Feb-2022 8pm",
                "02-Feb-2022 11pm","a-123",
                flight,passenger1,2000,false,"Business Class");
        //regularTicket.setFrom("Mumbai");
        System.out.println(regularTicket.toString());

        String[] locaton = {"taj-mahal","lal-killa"};
        TouristTicket touristTicket = new TouristTicket("tt1","Mumbai","Delli","02-Feb-2022 8pm",
                "02-Feb-2022 11pm","a-123",
                flight,passenger2,2000,false,
                "Sanghrila",locaton);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
}
