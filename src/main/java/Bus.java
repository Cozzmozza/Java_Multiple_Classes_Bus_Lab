import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        passengers = new ArrayList<Person>();
    }

    public int getNumPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        int remainingCapacity = getNumPassengers();
        if ((remainingCapacity+1) <= this.capacity){
            this.passengers.add(person);
        }

    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        addPassenger(person);
    }
}
