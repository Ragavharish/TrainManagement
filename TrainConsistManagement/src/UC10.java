import java.util.ArrayList;
import java.util.List;

public class UC10 {

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
        bogies.add(new Bogie("General", 90, "Passenger"));
        bogies.add(new Bogie("Cargo", 120, "Goods"));

        // Display Original List
        System.out.println("Train Bogies:");
        bogies.forEach(System.out::println);

        // Stream Aggregation using map() and reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display Total Seats
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // Verify Original List Unchanged
        System.out.println("\nOriginal List After Aggregation:");
        bogies.forEach(System.out::println);
    }
}