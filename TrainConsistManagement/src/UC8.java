import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC8 {

    // Bogie Class (Same as UC7)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Second Sitting", 60));

        // Display Original List
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // Filter using Stream (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display Filtered Bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify Original List Unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        bogies.forEach(System.out::println);
    }
}