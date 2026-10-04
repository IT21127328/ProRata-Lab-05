import java.util.Scanner;

public class IT21127328Lab5Q3 {

    public static void main(String[] args) {
        // Constants
        final double ROOM_CHARGE_PER_DAY = 48000.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Range check (between 1 and 31)
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            scanner.close();
            return;
        }

        // Validation 2: Sequence check (start date must be less than end date)
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            scanner.close();
            return;
        }

        int daysReserved = endDate - startDate;
        double discountRate = 0.0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10.0;
        } else if (daysReserved >= 5) {
            discountRate = 20.0;
        }

        double totalAmount = (daysReserved * ROOM_CHARGE_PER_DAY) * (1 - (discountRate / 100.0));

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        scanner.close();
    }
}