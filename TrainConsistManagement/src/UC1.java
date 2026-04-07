import java.util.*;

public class UC1 {

    // Coach Class
    static class Coach {
        String coachId;
        String type;

        Coach(String coachId, String type) {
            this.coachId = coachId;
            this.type = type;
        }

        @Override
        public String toString() {
            return coachId + "(" + type + ")";
        }
    }

    // Train Class
    static class Train {

        LinkedList<Coach> coaches = new LinkedList<>();
        HashSet<String> coachSet = new HashSet<>();
        Stack<LinkedList<Coach>> undoStack = new Stack<>();

        // Save state for undo
        private void saveState() {
            undoStack.push(new LinkedList<>(coaches));
        }

        // Add coach
        void addCoach(Coach coach) {
            if (!coachSet.contains(coach.coachId)) {
                saveState();
                coaches.add(coach);
                coachSet.add(coach.coachId);
            }
        }

        // Insert coach
        void insertCoach(int index, Coach coach) {
            if (!coachSet.contains(coach.coachId)) {
                saveState();
                coaches.add(index, coach);
                coachSet.add(coach.coachId);
            }
        }

        // Remove coach
        void removeCoach(String coachId) {
            saveState();
            coaches.removeIf(c -> c.coachId.equals(coachId));
            coachSet.remove(coachId);
        }

        // Swap coaches
        void swap(int i, int j) {
            saveState();
            Collections.swap(coaches, i, j);
        }

        // Reverse
        void reverse() {
            saveState();
            Collections.reverse(coaches);
        }

        // Undo
        void undo() {
            if (!undoStack.isEmpty()) {
                coaches = undoStack.pop();
            }
        }

        // Display
        void display() {
            System.out.println("\nTrain Consist:");
            for (Coach c : coaches) {
                System.out.print(c + " -> ");
            }
            System.out.println("END");
        }
    }

    public static void main(String[] args) {

        Train train = new Train();

        // Initial Coaches
        train.addCoach(new Coach("ENG", "Engine"));
        train.addCoach(new Coach("S1", "Sleeper"));
        train.addCoach(new Coach("S2", "Sleeper"));
        train.addCoach(new Coach("AC1", "AC"));

        train.display();

        // Insert
        train.insertCoach(2, new Coach("GEN1", "General"));
        train.display();

        // Remove
        train.removeCoach("S1");
        train.display();

        // Swap
        train.swap(1, 2);
        train.display();

        // Reverse
        train.reverse();
        train.display();

        // Undo
        train.undo();
        train.display();
    }
}