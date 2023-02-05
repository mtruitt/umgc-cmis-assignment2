/**
 * Mark Truitt
 * CMIS 242 - Assignment 2: Inheritance and Encapsulation
 * 2023/02/05
 *
 * This program allows the user to choose between ordering a FruitSnack or a SaltySnack.
 * The user can specify the size and any additional options such as including citrus fruit for a FruitSnack or nuts for a SaltySnack.
 * The program returns the details of the ordered snack, including its type, size, unique identifier, and price.
 * The program terminates when the user selects to exit.
 */

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // attributes
        boolean ordering = true;
        int choice;

        while (ordering) {
            // Print the menu to the console
            System.out.println("MENU");
            System.out.println("1: Order a Snack\n2: Exit program");
            System.out.print("Enter your selection: ");

            // Read the user's menu selection
            choice = sc.nextInt();

            // Act on the user's selection
            switch (choice) {
                case 1 -> {
                    // If the user selects to order a snack, prompt them for further details
                    System.out.println("Do you want Fruit Snack (1) or Salty Snack (2): ");
                    int snackType = sc.nextInt();
                    Snack snack;

                    // Create the appropriate snack based on the user's selection
                    if (snackType == 1) {
                        System.out.println("What size do you want: S, M, or L: ");
                        String size = sc.next();
                        System.out.println("Do you want citrus fruit included? true/false: ");
                        boolean includeCitrusFruit = sc.nextBoolean();
                        snack = new FruitSnack(size, includeCitrusFruit);
                    } else {
                        System.out.println("What size do you want: S, M, or L: ");
                        String size = sc.next();
                        System.out.println("Do you want a nut snack included? true/false: ");
                        boolean includeNutSnack = sc.nextBoolean();
                        snack = new SaltySnack(size, includeNutSnack);
                    }

                    // Print the details of the snack to the console
                    String className = snack.getClass().getSimpleName();
                    System.out.println("You have chosen snack type = " + formatClassName(className) +
                            ", of type = " + snack.getSize() + ", id = " + snack.getId() +
                            " and price = " + snack.getPrice());
                }
                case 2 -> {
                    // If the user selects to exit the program, set run too false to exit the loop
                    ordering = false;
                    System.out.println("Thank you for using the program. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner object
        sc.close();
    }

    // A helper method to format the class name for display
    static String formatClassName(String className) {
        return switch (className) {
            case "FruitSnack" -> "Fruit Snack";
            case "SaltySnack" -> "Salty Snack";
            default -> className;
        };
    }
}
