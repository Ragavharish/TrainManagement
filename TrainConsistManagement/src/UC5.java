import java.util.LinkedHashSet;

public class UC5 {

    public static void main(String[] args) {

        // Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add Bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper");

        // Display Train Formation
        System.out.println("Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Show total bogies
        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());
    }
}