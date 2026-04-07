import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UC9 {

    // Bogie Class
    static class Bogie {
        String name;
        int capacity;
        String type;

        Bogie(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo", 120, "Goods"));
        bogies.add(new Bogie("Parcel", 100, "Goods"));
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));

        // Display Original List
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // Group using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        // Display Grouped Result
        System.out.println("\nGrouped Bogies by Type:");

        groupedBogies.forEach((type, list) -> {
            System.out.println("\n" + type + " Bogies:");
            list.forEach(System.out::println);
        });

        // Verify Original List Unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        bogies.forEach(System.out::println);
    }
}