// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {

    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie Type: " + type + ", Capacity: " + capacity);
    }
}

// Main Application
public class TrainApp {

    public static void main(String[] args) {

        try {

            // Valid bogie creation
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            PassengerBogie acChair = new PassengerBogie("AC Chair", 56);

            System.out.println("Valid Bogies Created Successfully:");
            sleeper.display();
            acChair.display();

            // Invalid bogie example
            PassengerBogie invalid = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues safely after validation.");
    }
}