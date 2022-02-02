package Project;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(){

    }
    public RegularTicket(String specialServices){
        this.specialServices = specialServices;
    }

    public RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,Flight flight,Passenger passenger,float price,boolean cancelled
            ,String specialServices){
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,flight,passenger,price,cancelled);
        this.specialServices = specialServices;
    }
    public String getSpecialServices(){ return specialServices; }

    public  void setSpecialServices(String specialServices){ this.specialServices = specialServices; }

}
