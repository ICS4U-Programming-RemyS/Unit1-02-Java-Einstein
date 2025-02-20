import java.util.Scanner;


/**.
* This program will calculate the energy released based on mass.
*
* @author  Remy Skelton
* @version 1.0
* @since   2025-February-14
*/


final class Einstein {
    /**.
    * SPEED_OF_LIGHT as a double constant
    **/
    private static final long SPEED_OF_LIGHT = 299792458L;


    /**
    * This is a private constructor used to satisfy the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }


    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(final String[] args) {
        // Welcome message
        System.out.println("This program will calculate the energy released based on mass.");

        // Use a scanner to get the mass from the user
        Scanner scanner = new Scanner(System.in);

        // Declare mass double variable
        double massAsDouble;

        // Do while loop to run until valid mass is entered
        do {
            // Message for input
            System.out.println("Please enter the mass you will be using in kg: ");
            // Get the mass as a string
            String massAsString = scanner.nextLine();

            try {
                // Convert string to double
                massAsDouble = Double.parseDouble(massAsString);

                // If statement for valid input
                if (massAsDouble >= 0) {
                    // Break the loop if the input is valid
                    break;
                } else {
                    // Error message for invalid input
                    System.out.println("Invalid input: " + massAsString
                            + ". Mass must be 0 or greater.");
                }
            } catch (NumberFormatException error) {
                // Error message for invalid input
                System.out.println("Invalid input: " + massAsString
                            + ". Mass must be 0 or greater.");
           }
        // While True for infinite loop until break
        } while (true);

        // Calculate the weight per log
        final double energyInJoules = massAsDouble * Math.pow(SPEED_OF_LIGHT, 2);

        // Display the max number of logs
        System.out.print("The energy released from ");
        System.out.format(" %.3f", +massAsDouble);
        System.out.print("kg of mass is: ");
        // % .3e is scientific notation with 3 decimal places
        System.out.format(" %.3e", +energyInJoules);
        System.out.println("J");

    // Close scanner
    scanner.close();
    }
}
