import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " Bogie - Capacity: " + capacity);
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 72));

        System.out.println("Passenger Bogies in Train:");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Stream pipeline to calculate total seating capacity
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);    // aggregate capacities

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}