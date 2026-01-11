import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner vb = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Welcome to Calculator ----");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = vb.nextInt();

            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }

            // Check if choice is valid before asking for numbers
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = vb.nextDouble();
            System.out.print("Enter second number: ");
            double b = vb.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        vb.close(); 
    }
}

