package Project;

public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeat;

    public Flight(){

    }
    public Flight(String flightNumber,String airline,int capacity,int bookedSeat){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this. capacity = capacity;
        this.bookedSeat = bookedSeat;
    }



    public String getFlightNumber(){ return flightNumber; }

    public  void setFlightNumber(String flightNumber){ this.flightNumber = flightNumber; }

    public String getAirline(){ return airline; }

    public  void setAirline(String airline){ this.airline = airline; }

    public int getCapacity(){ return capacity; }

    public  void setCapacity(int capacity){ this.capacity = capacity; }

    public int getBookedSeat(){ return bookedSeat; }

    public  void setBookedSeat(int bookedSeat){ this.bookedSeat = bookedSeat; }

    public String getFlightDetails() {
        return "flightNumber=" + flightNumber + " , capacity=" +  capacity +  ", bookedSeat=" + bookedSeat +  ", bookedSeat=" + airline;
    }
     public boolean checkAvailability(){
        return  this.bookedSeat<capacity;
     }
     public void incrementBookingCounter(){
        bookedSeat++;
     }
    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", capacity=" + capacity +
                ", bookedSeat=" + bookedSeat +
                '}';
    }
}
