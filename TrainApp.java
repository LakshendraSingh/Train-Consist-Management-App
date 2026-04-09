// Passenger Bogie class
class PassengerBogie {

    private int capacity;

    public PassengerBogie(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Train Consist Management App
public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Display array
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Original Passenger Bogie Capacities:");
        display(capacities);

        // Sort using Bubble Sort
        bubbleSort(capacities);

        System.out.println("Sorted Passenger Bogie Capacities:");
        display(capacities);

        System.out.println("Sorting completed using Bubble Sort.");
    }
}