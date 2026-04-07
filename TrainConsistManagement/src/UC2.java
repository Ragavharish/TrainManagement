import java.util.ArrayList;

public class UC2 {

    public static void main(String[] args) {

        // Create ArrayList for Passenger Bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // User runs program - Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies
        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nChecking if Sleeper exists:");
        System.out.println("Sleeper exists? " + exists);

        // Final list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}