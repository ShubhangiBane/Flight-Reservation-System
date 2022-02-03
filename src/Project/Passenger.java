package Project;

public class Passenger {
    private static int idCounter;
    private int id;
    private Address address;
    private Contact contact;

    public Passenger(){
        idCounter++;
    }
    public Passenger(int id, String street, String city, String state, String name, String phone, String email){
        this.id = id;
        this.address = new Address(street,city,state);
        this.contact = new Contact( name, phone, email);
        idCounter++;
    }

    public int getId(){ return id; }

    public  void setId(int id){ this.id = id; }

    public Address getAddress(){ return address; }

    public  void setAddress(Address address){ this.address = address; }

    public Contact getContact(){ return contact; }

    public  void setContact(Contact contact){ this.contact = contact; }



    public Contact getContact(Contact contact) {return contact;}
    public Address getAddress(Address Address) {return address;}
    public static  int getPassengerCount(){return idCounter;}


    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", address=" + address +
                ", contact=" + contact +
                '}';

    }



    private static class Contact {

        private String name,phone,email;
        public Contact(){

        }
        public Contact( String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName(){ return name; }

        public  void setName(String name){ this.name = name; }

        public String getPhone(){ return phone; }

        public  void setPhone(String phone){ this.phone = phone; }

        public String getEmail(){ return email; }

        public  void setEmail(String email){ this.email = email; }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


    private static class Address {

        private String street,city,state;
        public Address(){

        }
        public Address(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet(){ return street; }

        public  void setStreet(String street){ this.street = street; }

        public String getCity(){ return city; }

        public  void setCity(String city){ this.city = city; }

        public String getState(){ return state; }

        public  void setState(String state){ this.state = state; }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }

}
