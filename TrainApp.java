import java.util.LinkedHashSet;

public class TrainConsistUC5 {

    public static void main(String[] args) {

        // Create LinkedHashSet to store train bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies to the formation
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}