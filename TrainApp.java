import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {

    public static void main(String[] args) {

        // Create HashMap to store Bogie -> Capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // Display capacity of each bogie
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }

        System.out.println("Program continues...");
    }
}