// imports needed for this class
import java.util.Scanner; // Scanner used to read user input

public class CalculatorConsole {
    public static void main(String[] args) throws Exception{ // main method to be run
        // declaration of variables
        Scanner print = new Scanner(System.in); // new Scanner object made
        double one = 0; // to keep track of the first number
        double two = 0; // to keep track of the second number
        double result = 0; // to store the result
        String op = ""; // to store the users operator of choice
        String[] ops = {"+", "-", "*", "/", "%"}; // array of available operations
        int end = 1; // helps loop the code (also allows the user to be able to break out of the loop)
        System.out.println(" - - - Welcome to the GDSC Calculator - - - ");
        while (end > 0) { // while end is not less than 0 do ...
            // asks the user for their inputs qne their mathematical sign
            System.out.print("\nPlease enter the first number: ");
            one = print.nextDouble();
            System.out.print("Please enter the second number: ");
            two = print.nextDouble();
            print.nextLine();
            System.out.print("Please select an operator. \n0 - Addition \n1 - Subtraction \n2 - Multiplication \n3 - Division \n4 - Modulus \n\nOnly enter the number: ");
            op = ops[print.nextInt()]; // uses the users choice as the index for the operation (do throw exceptions for index out of range or wrong data type input)
            print.nextLine(); // separator - used for the look of the output
            switch (op) { // switch statement that defines what the result should be depending on the operation chosen
                case "+": // eg, if the user chose Addition, then the result should be the first number plus the second number
                    result = one + two;
                    break; // separates the cases
                case "-":
                    result = one - two;
                    break;
                case "*":
                    result = one * two;
                    break;
                case "/": // used to avoid division by zero without throwing an exception.
                    if (two == 0) {
                        result = -1;
                    }
                    else {
                        result = one / two;
                    }
                    break;
                case "%": // same as with the division
                    if (two == 0) {
                        result = -1;
                    }
                    else {
                        result = one % two;
                    }
                    break;
                default:
                    result = -1; // unless expected, -1 is associated with a mistake in this code
                    break;
            } // end of switch statement
            // printing of the results
            System.out.printf("The result of the operation of %,.2f and %,.2f is %,.2f \nEnter any number above zero to continue, or any number below zero to exit.", one, two, result);
            // the answer put in here will determine whether the user breaks out of the while loop
            end = print.nextInt();
            print.nextLine();
        } // end of while loop

    } // end of main method
} // end of CalculatorConsole class
