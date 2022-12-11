// imports for this class
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CalculatorGUI extends JFrame{ // inherits from JFrame
//    declaration of GUI parts
    private JPanel firstPanel;
    private JTextField inputView;
    private JButton piButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;
    private JButton conversionButton;
    private JButton acButton;
    private JButton additionButton;
    private JButton subtractionButton;
    private JButton divisionButton;
    private JButton multiplicationButton;
    private JButton modulusButton;
    private JButton clearOneButton;
    private JButton oneButton;
    private JButton equalButton;
    private JLabel errorLabel;
//    Declaration of variables

    private String num1 = "";
    private String num2 = "";
    private String num3 = "" ;
    private String num4 = "";
    private String op1 = "";
    private String op2 = "";
    private String op3 = "";
    private double one = 0;
    private double two = 0;
    private double three = 0;
    private double four = 0;
    private double result = 0;

//    methods for the gui
    public CalculatorGUI(String title) { // constructor for the Calculator GUI class - parameter for window title
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes when clicked
        this.setContentPane(firstPanel); // set a reference to the panel for the builder
        this.pack(); // sizes the frame so that all its contents are at or above their preferred sizes

        // default the error message not appear
        errorLabel.setVisible(false);

        // code so that number buttons (of the GUI) add a number to the input view text field
        zeroButton.addActionListener(new ActionListener() { // reads as: when zero is clicked ...
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"0");
            } // ...set the text of the input field to be what it previously was but append 0 to the end.
        });
        oneButton.addActionListener(new ActionListener() { // the same explanation for zero applies to all the number buttons
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"9");
            }
        });

        // clears the input field and resets the variables
        acButton.addActionListener(new ActionListener() { // when clicked...
            @Override
            public void actionPerformed(ActionEvent e) { //... do this ...
                errorLabel.setVisible(false); //... hide the error label
                inputView.setText(""); // ... clear the input text field
                num1 = ""; // set the first possible input to empty
                num2 = ""; // set the second possible input to empty
                num3 = ""; // set the third possible input to empty
                num4 = ""; // set the fourth possible input to empty
                op1 = ""; // set the first possible operator to empty
                op2 = ""; // set the second possible operator to empty
                op3 = ""; // set the third possible operator to empty
                one = 0; // set the first possible number to empty
                two = 0; // set the second possible number to empty
                three = 0; // set the third possible number to empty
                four = 0; // set the fourth possible number to empty
            }
        });

        // Clears one character from the back of the current input in the input view text field
        clearOneButton.addActionListener(new ActionListener() { // when clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                // declares a string to store the new text to be displayed
                String newText = "";

                if(inputView.getText().length() > 0 ) { // if the text in the input field has more than 0 characters then....
                    StringBuilder prevText = new StringBuilder(inputView.getText()); // create a new StringBuilder object to store the previous string
                    prevText.deleteCharAt(inputView.getText().length()-1); // use the StringBuilder deleteCharAt method to delete the character that is last (at position of the strings length - 1)
                    newText = prevText.toString(); // then set the new text to be the output of that StringBuilder once converted to type String
                    inputView.setText(newText); // set the text of the text field to display this new string.

                }
            }
        });

        // beginning of the mathematical operations code

        // code for addition
        additionButton.addActionListener(new ActionListener() { // once addition is clicked....
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false); // hide the error label

                if (num1.isEmpty() && inputView.getText().isEmpty()){ // if the first number is empty and the input field is empty
                    // do nothing (not the best implementation)

                }
                else if (num1.isEmpty()) { // else if the first number is empty then....
                    num1 = inputView.getText(); // set num1 to the text in the inputView
                    op1 = "+"; // let the first operation be addition
                    one = Double.parseDouble(num1); // and parse it to type double for the actual calculations later
                    inputView.setText(""); // clear the input view
                }
                else if (num2.isEmpty()) { // else if num 2 is empty
                    num2 = inputView.getText(); // set num2 to the text in the inputView
                    op2 = "+"; // let the second operation be addition
                    two = Double.parseDouble(num2); // and parse it to type double for the actual calculation later
                    inputView.setText(""); // clear the input view
                }
                else if (num3.isEmpty()) { // else if num 3 is empty
                    num3 = inputView.getText(); // set num3 to the text in the inputView
                    op3 = "+"; // let the third operation be addition
                    three = Double.parseDouble(num3); // and parse it to type double for the actual calculation later
                    inputView.setText(""); // clear the input view
                }
            }
        });
        // code for subtraction
        subtractionButton.addActionListener(new ActionListener() { // the same as for addition, but substitute "addition" for "subtraction"
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);

                if (num1.isEmpty() && inputView.getText().isEmpty()){

                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    op1 = "-";
                    one = Double.parseDouble(num1);
                    inputView.setText("");
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    op2 = "-";
                    two = Double.parseDouble(num2);
                    inputView.setText("");
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    op3 = "-";
                    three = Double.parseDouble(num3);
                    inputView.setText("");
                }
            }
        });
        // code for multiplication
        multiplicationButton.addActionListener(new ActionListener() { // the same as for addition, but substitute "addition" for "multiplication"
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);

                if (num1.isEmpty() && inputView.getText().isEmpty()){

                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    op1 = "*";
                    one = Double.parseDouble(num1);
                    inputView.setText("");
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    op2 = "*";
                    two = Double.parseDouble(num2);
                    inputView.setText("");
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    op3 = "*";
                    three = Double.parseDouble(num3);
                    inputView.setText("");
                }
            }
        });
        // code for division
        divisionButton.addActionListener(new ActionListener() { // the same as for addition, but substitute "addition" for "division"
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);

                if (num1.isEmpty() && inputView.getText().isEmpty()){

                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    op1 = "/";
                    one = Double.parseDouble(num1);
                    inputView.setText("");
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    op2 = "/";
                    two = Double.parseDouble(num2);
                    inputView.setText("");
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    op3 = "/";
                    three = Double.parseDouble(num3);
                    inputView.setText("");
                }
            }
        });
        // code for modulus
        modulusButton.addActionListener(new ActionListener() { // the same as for addition, but substitute "addition" for "modulus"
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);
                if (num1.isEmpty() && inputView.getText().isEmpty()){

                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    op1 = "%";
                    one = Double.parseDouble(num1);
                    inputView.setText("");
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    op2 = "%";
                    two = Double.parseDouble(num2);
                    inputView.setText("");
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    op3 = "%";
                    three = Double.parseDouble(num3);
                    inputView.setText("");
                }
            }
        });
        // code to get the answer
        equalButton.addActionListener(new ActionListener() { // when the equal button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.isEmpty() && num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) { // if all the numbers are empty
                    num1 = inputView.getText(); // num one gets what is in the input
                    inputView.setText(num1); // the input is set to num 1 (This can be shortened by just not doing anything at all at this step and teh one before it)
                    num1 = ""; // clear num1
                    one = 0; // ensure that one is also cleared
                }
                else if (!num1.isEmpty() && num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) { // if all the numbers except for num1 are emoty
                    num2 = inputView.getText(); // set num2 to the inputView's text
                    two = Double.parseDouble(num2); // parse that input to type double
                    switch (op1) { // determine results depending on the operation required
                        case "+": // if plus, then add
                            result = one + two;
                            break;
                        case "-": // if minus then subtract
                            result = one - two;
                            break;
                        case "*": // if times/asterisk then multiply
                            result = one * two;
                            break;
                        case "/": // if forward slash or division then divide
                            if (two == 0) { // unless if num2 is zero
                                // division by 0
                                errorLabel.setVisible(true); // then show error
                            }
                            else {
                                result = one / two; // else divide
                            }
                            break;
                        case "%": // if percentage sign then find remainder
                            if (two == 0) { // unless if num2 is zero
                                // division by 0
                                errorLabel.setVisible(true); // then show error
                            }
                            else {
                                result = one % two; // else find remainder
                            }
                            break;
                    }
                    inputView.setText(String.format("%,.2f", result)); // show result
                    // clear variables used
                    num1 = "";
                    num2 = "";
                    op1 = "";
                    one = 0;
                    two = 0;
                }
                else if (!num1.isEmpty() && !num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) { // else if num1 and 2 are not empty however, num3 and 4 are
                    num3 = inputView.getText(); // set num3 to inputView text
                    three = Double.parseDouble(num3); // parse to double
                    switch (op1) { // same as that shown in previous else if
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
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result = one / two;
                            }
                            break;
                        case "%":
                            if (two == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result = one % two;
                            }
                            break;
                    }
                    switch (op2) { // same as in previous switch however operation is between the previous answer and num 3
                        case "+":
                            result += three;
                            break;
                        case "-":
                            result -= three;
                            break;
                        case "*":
                            result *= three;
                            break;
                        case "/":
                            if (three == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result /= three;
                            }
                            break;
                        case "%":
                            if (three == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result %= three;
                            }
                            break;
                    }
                    inputView.setText(String.format("%,.2f", result)); // shows result
                    // clears variables used
                    num1 = "";
                    num2 = "";
                    num3 = "";
                    op1 = "";
                    op2 = "";
                    one = 0;
                    two = 0;
                    three = 0;
                }
                else if (!num1.isEmpty() && !num2.isEmpty() && !num3.isEmpty() && num4.isEmpty()) { // else if only num4 is empty
                    num4 = inputView.getText(); // set num4 to inputView's text
                    four = Double.parseDouble(num3); // parse to double
                    switch (op1) { // same as in previous else if
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
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result = one / two;
                            }
                            break;
                        case "%":
                            if (two == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result = one % two;
                            }
                            break;
                    }
                    switch (op2) { // same as in previous switch, except that operation is between previous result and num3
                        case "+":
                            result += three;
                            break;
                        case "-":
                            result -= three;
                            break;
                        case "*":
                            result *= three;
                            break;
                        case "/":
                            if (three == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result /= three;
                            }
                            break;
                        case "%":
                            if (three == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result %= three;
                            }
                            break;
                    }
                    switch (op3) { // same as in previous switch statement however, operation is between previous result and num4
                        case "+":
                            result += four;
                            break;
                        case "-":
                            result -= four;
                            break;
                        case "*":
                            result *= four;
                            break;
                        case "/":
                            if (four == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result /= four;
                            }
                            break;
                        case "%":
                            if (four == 0) {
                                // division by 0
                                errorLabel.setVisible(true);
                            }
                            else {
                                result %= four;
                            }
                            break;
                    }
                    inputView.setText(String.format("%,.2f", result)); // display result
                    // clear variables used
                    num1 = "";
                    num2 = "";
                    num3 = "";
                    num4 = "";
                    op1 = "";
                    op2 = "";
                    op3 = "";
                    one = 0;
                    two = 0;
                    three = 0;
                    four = 0;
                }

            }
        });
        // all results are rounded off to two decimal places

        // code for the PI button
        piButton.addActionListener(new ActionListener() { // when clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false); // hide error message

                // declare variables
                String newPi = "";

                if (num1.isEmpty() && inputView.getText().isEmpty()){ // if num1 and input field are empty
                    num1 = "3.141592653589793"; // num1 is pi
                    one = Math.PI; // one gets the math PI
                    inputView.setText(num1); // and input displays num1
                }
                else if (num1.isEmpty()) { // if num1 is empty
                    num1 = inputView.getText(); // num one gets what was previously input
                    one = Double.parseDouble(num1) * Math.PI; // one gets pi times previous input
                    newPi = String.format("%,.2f", one); //new pie rounds off that number and turns it to type string
                    inputView.setText(newPi); // result displayed
                    num1 = ""; // num one cleared
                }
                else if (num2.isEmpty()) { // same as first else if with different variable: num2
                    num2 = inputView.getText();
                    two = Double.parseDouble(num2) * Math.PI;
                    newPi = String.format("%,.2f", two);
                    inputView.setText(newPi);
                    num2 = "";
                }
                else if (num3.isEmpty()) { // same as first else if with different variable: num3
                    num3 = inputView.getText();
                    three = Double.parseDouble(num3) * Math.PI;
                    newPi = String.format("%,.2f", three);
                    inputView.setText(newPi);
                    num3 = "";
                }
                else { // same as first else if with different variable: num4
                    num4 = inputView.getText();
                    four = Double.parseDouble(num4) * Math.PI;
                    newPi = String.format("%,.2f", four);
                    inputView.setText(newPi);
                    num4 = "";
                }
                newPi = "";
            }
        });
        conversionButton.addActionListener(new ActionListener() { // when clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new ConversionGUI("GDSC Conversion"); // create new frame object from the ConversionGUI class (code for it in its own folder)
                frame2.setVisible(true); // ensure it can be seen
            }
        });
    } // end of the constructor methode

//    Main method to show the frame
    public static void main(String[] args) throws Exception { // throws exception to catch any errors that have not been built against
        // declaration of variables
        Scanner print = new Scanner(System.in); // Scanner to read user input
        int choice = 0;
        System.out.print("Would you like to use the calculator? \nEnter 1 for yes, Enter 2 for no: ");
        choice = print.nextInt();
        if (choice == 1) { // if the user chooses 1, then the application is run, else nothing happens and so the code exits
            JFrame frame = new CalculatorGUI("GDSC Calculator"); // passes in the name of the application to be viewed at the top of the application
            frame.setVisible(true); // ensures we can see the frame
        } //end of the if statement
    } // end of the main method
} // end of the CalculatorGUI class
