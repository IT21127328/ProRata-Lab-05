import java.util.Scanner;

public class IT21127328Lab5Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int third = scanner.nextInt();

        // Find smallest
        int smallest = first;
        if (second < smallest) {
            smallest = second;
        }
        if (third < smallest) {
            smallest = third;
        }

        // Find largest
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        System.out.println("\nUser entered numbers are : " + first + " " + second + " " + third);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        scanner.close();
    }
}