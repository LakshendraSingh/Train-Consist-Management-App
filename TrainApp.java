import java.util.Arrays;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String searchKey) {

        // Handle empty array case
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Ensure array is sorted before applying binary search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } 
            else if (comparison < 0) {
                high = mid - 1; // Search left half
            } 
            else {
                low = mid + 1; // Search right half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Example bogie IDs (can be sorted or unsorted)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        System.out.println("Bogie IDs in Train:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = binarySearch(bogieIds, searchKey);

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        if (found) {
            System.out.println("Result: Bogie " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }

        System.out.println("\nSorted Bogie IDs used for Binary Search:");
        System.out.println(Arrays.toString(bogieIds));
    }
}