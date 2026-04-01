import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger Bogies after removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper bogie
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train consist.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Final state of the list
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);
    }
}