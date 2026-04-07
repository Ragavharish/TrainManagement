import java.util.HashSet;

public class UC3 {

    public static void main(String[] args) {

        // Create HashSet for Bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // User adds bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate
        bogieIds.add("BG104");

        // Display Unique Bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

        // Show size to confirm duplicates removed
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}