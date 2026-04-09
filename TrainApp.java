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

    int getCapacity() {
        return capacity;
    }

    String getName() {
        return name;
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Create bogie dataset
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 80));
        bogies.add(new Bogie("First Class", 65));

        // ------------------------------
        // Loop Based Filtering
        // ------------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ------------------------------
        // Stream Based Filtering
        // ------------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ------------------------------
        // Results
        // ------------------------------
        System.out.println("Loop Filtered Bogies Count: " + loopFiltered.size());
        System.out.println("Loop Execution Time: " + loopTime + " ns");

        System.out.println();

        System.out.println("Stream Filtered Bogies Count: " + streamFiltered.size());
        System.out.println("Stream Execution Time: " + streamTime + " ns");

        // Verify both results are same
        if (loopFiltered.size() == streamFiltered.size()) {
            System.out.println("\nResult Check: Both approaches returned the same result.");
        } else {
            System.out.println("\nResult Check: Results differ.");
        }
    }
}