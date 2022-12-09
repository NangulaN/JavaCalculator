import java.util.Scanner;

public class CalculatorConsole {
    public static void main(String[] args) {
        // declaration of variables
        Scanner print = new Scanner(System.in);
        double one = 0;
        double two = 0;
        double result = 0;
        String op = "";
        String[] ops = {"+", "-", "*", "/", "%"};
        int end = 1; // helps loop the code
        System.out.println(" - - - Welcome to the GDSC Calculator - - - ");
        while (end > 0) { // while end is not equal to 0 do ...
            System.out.print("\nPlease enter the first number: ");
            one = print.nextDouble();
            System.out.print("Please enter the second number: ");
            two = print.nextDouble();
            print.nextLine();
            System.out.print("Please select an operator. \n0 - Addition \n1 - Subtraction \n2 - Multiplication \n3 - Division \n4 - Modulus \n\nOnly enter the number: ");
            op = ops[print.nextInt()];
            print.nextLine();
            switch (op) {
                case "+":
                    result = one + two;
                    break;
                case "-":
                    result = one - two;
                    break;
                case "*":
                    result = one * two;
                    break;
                case "/":
                    if (two == 0) {
                        result = -1;
                    }
                    else {
                        result = one / two;
                    }
                    break;
                case "%":
                    if (two == 0) {
                        result = -1;
                    }
                    else {
                        result = one % two;
                    }
                    break;
                default:
                    result = -1;
                    break;
            } // end of switch statement
            System.out.printf("The result of the operation of %,.2f and %,.2f is %,.2f \nEnter any number above zero to continue, or any number below zero to exit.", one, two, result);
            end = print.nextInt();
            print.nextLine();
        }// end of while statement

    }
}
