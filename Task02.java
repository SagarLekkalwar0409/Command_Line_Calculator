
//Import the Scanner class from the java.util package.
import java.util.Scanner;

class Command_Line_Calculator {
    public static void main(String[] args) {

        // using while (true) in this program: for Continuous Operation, Exit condition,
        // Control Flow
        while (true) {
            // Display Operator Menu to User on Console After Running Class:
            System.out.println("Choose Operator which You Like to Perform");
            System.out.println("1.Addition");
            System.out.println("2.Substarction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("=====================");

            // Create a Scanner object to read user input.
            Scanner scn = new Scanner(System.in);

            // Take Operator input form user:
            int Operator = scn.nextInt();

            // If Choose is equal to 5, print a message and exit the calculator.
            if (Operator == 5) {
                System.out.println("=====================");
                System.out.println("Exiting the calculator..");
                System.out.println("=====================");

                break; //

                // If the user enters an invalid operator (choice less than 1 or greater than
                // 5),
                // program will display an error message and immediately Display Menu of the
                // Operator
            } else if (Operator < 1 || Operator > 5) {
                System.out.println("=====================");
                System.out.println("Enter Valid Operator");
                System.out.println("=====================");
                continue; // Skip the current iteration and continue to the next

            }

            System.out.println("Enter First Number");
            // Take First Value From User and Store in num1 Variable as a int type :
            double num1 = scn.nextInt();

            System.out.println("Enter Second Number");
            // Take Second Value From User and Store in num2 Variable as a int type :
            double num2 = scn.nextInt();

            // Initialize a variable to store the result as a double.
            double result = 0.0;

            if (Operator == 1) {
                result = num1 + num2; // If Choose is equal to 1, perform addition.

            } else if (Operator == 2) {
                result = num1 - num2; // If Choose is equal to 2, perform Substraction.

            } else if (Operator == 3) {
                result = num1 * num2; // If Choose is equal to 3, perform Multiplication.

            } if (Operator == 4) {
                if (num2 != 0) {
                    result = num1 / num2; // If Choose is equal to 4, check if num2
                                          // is not zero, then perform division.

                    // If Second Number is equal to zero then display msg to user DO NOT ENTER ZERO
                } else {
                    System.out.println("=====================");
                    System.out.println("Do Not Enter zero");
                    System.out.println("=====================");
                    continue;
                }

            }

            // Display the result to the user.
            System.out.println("=====================");
            System.out.println("Answer is : " + result);
            System.out.println("=====================");

        }

    }
}
