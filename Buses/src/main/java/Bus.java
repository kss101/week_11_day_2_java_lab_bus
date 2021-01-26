import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengerList;

    public Bus(String destination, int capacity){
        this.capacity = capacity;
        this.destination = destination;
        this.passengerList = new ArrayList<>();
    }

    public int passengerCount(){
        return passengerList.size();
    }

     public String addPassenger(Person person){
        if (checkBusNotFull() == true){
            passengerList.add(person);
        }
        return "Bus full!";
     }

     public boolean checkBusNotFull(){
        int totalPassengers = passengerCount();
        if (totalPassengers < capacity ){
            return true;
        }
        return false;
     }

     public void kickPassengerOff(){
        passengerList.remove(0);
     }

}
