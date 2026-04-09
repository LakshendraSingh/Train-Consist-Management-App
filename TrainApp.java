import java.util.Arrays;

public class TrainConsistManagementApp {

    // Search method with defensive validation
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Search operation not allowed: No bogies available in the train consist.");
        }

        // Perform search (linear search)
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Example bogie list
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchKey = "BG205";

        try {
            System.out.println("Bogie IDs in Train: " + Arrays.toString(bogieIds));

            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Result: Bogie " + searchKey + " found in the train consist.");
            } else {
                System.out.println("Result: Bogie " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}