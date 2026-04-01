import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        // Create LinkedList to represent the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies to the train
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogies
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Display final train consist
        System.out.println("\nFinal Train Consist after removing first and last bogie:");
        System.out.println(trainConsist);
    }
}