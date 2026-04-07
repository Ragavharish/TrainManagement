import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // Create HashMap for Bogie Capacity Mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert Bogie Capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);
        bogieCapacity.put("Guard", 2);

        // Display Bogie Capacities
        System.out.println("Bogie Capacity Mapping:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example Lookup
        System.out.println("\nCapacity Lookup:");
        System.out.println("Sleeper Capacity: " + bogieCapacity.get("Sleeper"));
    }
}