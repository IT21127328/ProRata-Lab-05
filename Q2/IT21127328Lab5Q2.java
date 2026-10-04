import java.util.Scanner;

public class IT21127328Lab5Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members = scanner.nextInt();

        // Validation for negative numbers
        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
            scanner.close();
            return;
        }

        System.out.println();
        // Determine prize using switch statement
        switch (members) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize is a : Pen");
                break;
            case 2:
                System.out.println("Prize is a : Umbrella");
                break;
            case 3:
                System.out.println("Prize is a : Bag");
                break;
            case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;
            default: // 5 or more members
                System.out.println("Prize is a : Headphone");
                break;
        }

        scanner.close();
    }
}