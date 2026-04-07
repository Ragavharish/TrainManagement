import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        // Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(train);

        // Remove First and Last Bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // Final Train Consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);
    }
}