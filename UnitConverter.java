import java.util.Scanner; // Corrected import statement

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit Converter!");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Length (meters <-> feet)");
        System.out.println("2. Weight (kilograms <-> pounds)");
        System.out.println("3. Volume (liters <-> gallons)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                handleLengthConversion(scanner);
                break;
            case 2:
                handleWeightConversion(scanner);
                break;
            case 3:
                handleVolumeConversion(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Length conversions
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    // Weight conversions
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    // Volume conversions
    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons / 0.264172;
    }

    // Methods to handle user input and perform conversions
    public static void handleLengthConversion(Scanner scanner) {
        System.out.println("Choose a conversion:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        int choice = scanner.nextInt();
        System.out.println("Enter the value to convert:");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " meters is " + metersToFeet(value) + " feet.");
        } else if (choice == 2) {
            System.out.println(value + " feet is " + feetToMeters(value) + " meters.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void handleWeightConversion(Scanner scanner) {
        System.out.println("Choose a conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        int choice = scanner.nextInt();
        System.out.println("Enter the value to convert:");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " kilograms is " + kilogramsToPounds(value) + " pounds.");
        } else if (choice == 2) {
            System.out.println(value + " pounds is " + poundsToKilograms(value) + " kilograms.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void handleVolumeConversion(Scanner scanner) {
        System.out.println("Choose a conversion:");
        System.out.println("1. Liters to Gallons");
        System.out.println("2. Gallons to Liters");
        int choice = scanner.nextInt();
        System.out.println("Enter the value to convert:");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " liters is " + litersToGallons(value) + " gallons.");
        } else if (choice == 2) {
            System.out.println(value + " gallons is " + gallonsToLiters(value) + " liters.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}