import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Array of bogie type names
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original bogie names
        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sorting using built-in Java method
        Arrays.sort(bogieTypes);

        // Display sorted bogie names
        System.out.println("Sorted Bogie Types (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("Sorting completed using Arrays.sort().");
    }
}