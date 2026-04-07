import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11 {

    public static void main(String[] args) {

        // Sample Inputs
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";

        String cargoCode1 = "PET-AB";
        String cargoCode2 = "PET-ab";

        // Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoIdPattern = Pattern.compile(cargoPattern);

        // Validate Train IDs
        validateTrainId(trainId1, trainIdPattern);
        validateTrainId(trainId2, trainIdPattern);

        // Validate Cargo Codes
        validateCargoCode(cargoCode1, cargoIdPattern);
        validateCargoCode(cargoCode2, cargoIdPattern);
    }

    // Train ID Validation Method
    private static void validateTrainId(String trainId, Pattern pattern) {
        Matcher matcher = pattern.matcher(trainId);

        if (matcher.matches()) {
            System.out.println("Train ID " + trainId + " is VALID");
        } else {
            System.out.println("Train ID " + trainId + " is INVALID");
        }
    }

    // Cargo Code Validation Method
    private static void validateCargoCode(String cargoCode, Pattern pattern) {
        Matcher matcher = pattern.matcher(cargoCode);

        if (matcher.matches()) {
            System.out.println("Cargo Code " + cargoCode + " is VALID");
        } else {
            System.out.println("Cargo Code " + cargoCode + " is INVALID");
        }
    }
}