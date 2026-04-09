import java.util.Arrays;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {   // equality comparison
                return true;              // early termination when match found
            }
        }

        return false; // returned if no match found
    }

    public static void main(String[] args) {

        // Array of bogie IDs (unsorted list)
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // Search key
        String searchKey = "BG309";

        System.out.println("Bogie IDs in Train:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("Searching for Bogie ID: " + searchKey);

        // Call linear search
        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Result: Bogie " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }

        System.out.println("Search operation completed.");
    }
}