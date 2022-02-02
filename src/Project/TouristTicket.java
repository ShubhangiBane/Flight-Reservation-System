package Project;

public class TouristTicket extends Ticket {

   private String hotelAddress;
    private String selectedTouristLocation = "[0..5]";

    public TouristTicket(){

    }

    public TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,Flight flight,Passenger passenger,float price,boolean cancelled
    ,String hotelAddress,String selectedTouristLocation){
     super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,flight,passenger,price,cancelled);
     this.hotelAddress = hotelAddress;
     this.selectedTouristLocation = selectedTouristLocation;
    }
    public TouristTicket(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }

    public static void removeTouristLocation(String location){

    }
    public static void addTouristLocation(String location){

    }
    public String getHotelAddress(){ return hotelAddress; }

    public  void setHotelAddress(String hotelAddress){ this.hotelAddress = hotelAddress; }

}
