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

        // code so that number buttons add a number to the input view text field
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputView.setText(inputView.getText()+"0");
            }
        });
        oneButton.addActionListener(new ActionListener() {
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
        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);
                inputView.setText("");
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
        });

        // Clears one character from the back of the current input in the input view text field
        clearOneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newText = "";

                if(inputView.getText().length() > 0 ) {
                    StringBuilder prevText = new StringBuilder(inputView.getText());
                    prevText.deleteCharAt(inputView.getText().length()-1);
                    newText = prevText.toString();
                    inputView.setText(newText);

                }
            }
        });

        // beginning of the mathematical operations code

        // code for addition
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);

                if (num1.isEmpty() && inputView.getText().isEmpty()){

                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    op1 = "+";
                    one = Double.parseDouble(num1);
                    inputView.setText("");
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    op2 = "+";
                    two = Double.parseDouble(num2);
                    inputView.setText("");
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    op3 = "+";
                    three = Double.parseDouble(num3);
                    inputView.setText("");
                }
            }
        });
        // code for subtraction
        subtractionButton.addActionListener(new ActionListener() {
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
        multiplicationButton.addActionListener(new ActionListener() {
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
        divisionButton.addActionListener(new ActionListener() {
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
        modulusButton.addActionListener(new ActionListener() {
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
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1.isEmpty() && num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) {
                    num1 = inputView.getText();
                    inputView.setText(num1);
                    num1 = "";
                    one = 0;
                }
                else if (!num1.isEmpty() && num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) {
                    num2 = inputView.getText();
                    two = Double.parseDouble(num2);
                    switch (op1) {
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
                    inputView.setText(String.format("%,.2f", result));
                    num1 = "";
                    num2 = "";
                    op1 = "";
                    one = 0;
                    two = 0;
                }
                else if (!num1.isEmpty() && !num2.isEmpty() && num3.isEmpty() && num4.isEmpty()) {
                    num3 = inputView.getText();
                    three = Double.parseDouble(num3);
                    switch (op1) {
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
                    switch (op2) {
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
                    inputView.setText(String.format("%,.2f", result));
                    num1 = "";
                    num2 = "";
                    num3 = "";
                    op1 = "";
                    op2 = "";
                    one = 0;
                    two = 0;
                    three = 0;
                }
                else if (!num1.isEmpty() && !num2.isEmpty() && !num3.isEmpty() && num4.isEmpty()) {
                    num4 = inputView.getText();
                    four = Double.parseDouble(num3);
                    switch (op1) {
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
                    switch (op2) {
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
                    switch (op3) {
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
                    inputView.setText(String.format("%,.2f", result));
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
        // code for the PI button
        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setVisible(false);
                String newPi = "";

                if (num1.isEmpty() && inputView.getText().isEmpty()){
                    num1 = "3.141592653589793";
                    one = Math.PI;
                    inputView.setText(num1);
                }
                else if (num1.isEmpty()) {
                    num1 = inputView.getText();
                    one = Double.parseDouble(num1) * Math.PI;
                    newPi = String.format("%,.2f", one);
                    inputView.setText(newPi);
                    num1 = "";
                }
                else if (num2.isEmpty()) {
                    num2 = inputView.getText();
                    two = Double.parseDouble(num2) * Math.PI;
                    newPi = String.format("%,.2f", two);
                    inputView.setText(newPi);
                    num2 = "";
                }
                else if (num3.isEmpty()) {
                    num3 = inputView.getText();
                    three = Double.parseDouble(num3) * Math.PI;
                    newPi = String.format("%,.2f", three);
                    inputView.setText(newPi);
                    num3 = "";
                }
                else {
                    num4 = inputView.getText();
                    four = Double.parseDouble(num4) * Math.PI;
                    newPi = String.format("%,.2f", four);
                    inputView.setText(newPi);
                    num4 = "";
                }
                newPi = "";
            }
        });
        conversionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new ConversionGUI("GDSC Conversion");
                frame2.setVisible(true);
            }
        });
    }

//    Main method to show the frame
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        int choice = 0;
        System.out.print("Would you like to use the calculator? \nEnter 1 for yes, Enter 2 for no: ");
        choice = print.nextInt();
        if (choice == 1) {
            JFrame frame = new CalculatorGUI("GDSC Calculator");
            frame.setVisible(true);
        }
    }
}
