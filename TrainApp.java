// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {

    private String shape;   // Rectangular or Cylindrical
    private String cargo;   // Assigned cargo

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {

        try {
            System.out.println("\nAttempting to assign cargo: " + cargoType + " to " + shape + " bogie");

            // Safety validation rule
            if (shape.equalsIgnoreCase("Rectangular") &&
                cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Petroleum cannot be transported in a Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully.");

        } catch (CargoSafetyException e) {

            System.out.println("Exception Caught: " + e.getMessage());

        } finally {

            System.out.println("Cargo assignment process completed (logged).");
        }
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void display() {
        System.out.println("Bogie Shape: " + shape +
                ", Cargo: " + (cargo != null ? cargo : "None"));
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        // Safe assignment
        cylindricalBogie.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        rectangularBogie.assignCargo("Petroleum");

        // Another safe assignment after exception
        rectangularBogie.assignCargo("Grains");

        System.out.println("\nFinal Bogie Status:");
        cylindricalBogie.display();
        rectangularBogie.display();

        System.out.println("\nProgram continues safely after handling runtime exceptions.");
    }
}