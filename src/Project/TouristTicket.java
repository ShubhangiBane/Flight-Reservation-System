package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket {

   private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(){

    }

    public TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,Flight flight,Passenger passenger,float price,boolean cancelled
    ,String hotelAddress,String[] selectedTouristLocation){
     super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,flight,passenger,price,cancelled);
     this.hotelAddress = hotelAddress;
     this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }



    public String getTouristLocation(){
     return Arrays.toString(selectedTouristLocation);
    }
    public void removeTouristLocation(String location){
     List<String> myList = new ArrayList<>(Arrays.asList(selectedTouristLocation));
     myList.remove(location);
     selectedTouristLocation = myList.toArray(new String[0]);
    }
    public void addTouristLocation(String location){
     List<String> myList = new ArrayList<>(Arrays.asList(selectedTouristLocation));
     myList.add(location);
     selectedTouristLocation = myList.toArray(new String[0]);

    }



    public String getHotelAddress(){ return hotelAddress; }

    public  void setHotelAddress(String hotelAddress){ this.hotelAddress = hotelAddress; }



}

