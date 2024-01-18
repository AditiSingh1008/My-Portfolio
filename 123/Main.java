class InvalidMeasurementException extends Exception {
    public InvalidMeasurementException(String message) {
        super(message);
    }
}

class MeasurementValidator {
    public static double getValidMeasurement(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double measurement = Double.parseDouble(System.console().readLine());

                if (measurement <= 0) {
                    throw new InvalidMeasurementException("Measurement must be greater than zero.");
                }

                return measurement;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (InvalidMeasurementException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MeasurementInput {
    public static void main(String[] args) {
        double length, width, height;

        System.out.println("Enter the dimensions of a box:");

        length = MeasurementValidator.getValidMeasurement("Enter the length: ");
        width = MeasurementValidator.getValidMeasurement("Enter the width: ");
        height = MeasurementValidator.getValidMeasurement("Enter the height: ");

        System.out.println("Valid measurements: Length = " + length + ", Width = " + width + ", Height = " + height);

        double volume = length * width * height;
        System.out.println("Volume of the box: " + volume);
    }
}
