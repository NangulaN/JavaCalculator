// imports needed for the class (packages)
import javax.swing.*;
import java.awt.event.*;

public class ConversionGUI extends JFrame{ //extends JFrame
    private JPanel secondPanel;
    private JTextField firstText;
    private JTextField secondText;
    private JRadioButton heightRadioButton;
    private JRadioButton currencyRadioButton;
    private JRadioButton temperatureRadioButton;
    private JRadioButton weightRadioButton;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private JButton clearButton;


    // declaration of variables
    double first = 0; // number in first field
    double second = 0; // number in second field
    String input = ""; // input for the fields (as you can not pass in doubles as they are)

    // conversions - easier to remember names rather than numbers
    double toFeet = 30.48;
    double toUSD = 0.067;
    double toPound = 2.205;
    public ConversionGUI(String title) { // constructor for the Calculator GUI class - parameter for window title
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes when clicked
        this.setContentPane(secondPanel); // set a reference to the panel for the builder
        this.pack(); // sizes the frame so that all its contents are at or above their preferred sizes

        firstText.addFocusListener(new FocusListener() { // focus listener added to the first text field
            @Override
            public void focusGained(FocusEvent e) { // when focus is gained, do nothing

            }

            @Override
            public void focusLost(FocusEvent e) { // once focus is lost
                first = Double.parseDouble(firstText.getText()); // parse the text in the first text field to type double and assign it to the (first) variable

                if (heightRadioButton.isSelected()) { // if the height radio button is selected then
                    second = first / toFeet; // second number should be the first divided by the conversion number
                    input = String.format("%,.2f", second); // input is that second number rounded off to two decimal places and converted to type string
                    secondText.setText(input); // display input in the second text field
                }
                else if (currencyRadioButton.isSelected()) { // else if currency is selected then
                    second = first / toUSD; // second number gets the result
                    input = String.format("%,.2f", second); // result is rounded off and stored as a string
                    secondText.setText(input); // result is displayed
                }
                else if (temperatureRadioButton.isSelected()) { // else if temperature is selected then
                    second = (first * 1.8) + 32; // second number gets the result
                    input = String.format("%,.2f", second); // result is rounded off and stored as a string
                    secondText.setText(input); // result is displayed
                }
                else if (weightRadioButton.isSelected()) { // else if weight is selected then
                    second = first * 2.205; // second number gets the result
                    input = String.format("%,.2f", second); // result is rounded off and stored as a string
                    secondText.setText(input); // result is displayed
                }
            }
        });
        secondText.addFocusListener(new FocusListener() { // focus listener added to the second text field
            @Override
            public void focusGained(FocusEvent e) { // when focus is gained do nothing (can be removed)

            }

            @Override
            public void focusLost(FocusEvent e) { // once focus is lost
                second = Double.parseDouble(secondText.getText()); // parse the text in the first field to type double and assign it to the (second) variable

                if (heightRadioButton.isSelected()) { // if the height radio button is selected then
                    first = second * toFeet; // first number should be the second number multiplied by the conversion number
                    input = String.format("%,.2f", first); // input is that first number rounded off to two decimal places and converted to type string
                    firstText.setText(input); // display input in the first text field
                }
                else if (currencyRadioButton.isSelected()) { // else if currency is selected then
                    first = second * toUSD; // first number gets the result
                    input = String.format("%,.2f", first); // result is rounded off and stored as a string
                    firstText.setText(input); // result is displayed
                }
                else if (temperatureRadioButton.isSelected()) { // else if temperature is selected then
                    first = (second - 32) * 0.55555555; // first number gets the result
                    input = String.format("%,.2f", first); // result is rounded off and stored as a string
                    firstText.setText(input); // result is displayed
                }
                else if (weightRadioButton.isSelected()) { // else if weight is selected
                    first = second / toPound; // first number gets the result
                    input = String.format("%,.2f", first); // result is rounded off and stored as a string
                    firstText.setText(input); // result is displayed
                }
            }
        });

        // all the radio buttons were grouped so that only one can be selected at a time
        heightRadioButton.addActionListener(new ActionListener() { // if selected ...
            @Override
            public void actionPerformed(ActionEvent e) { // change labels to display cm and feet
                firstLabel.setText("cm");
                secondLabel.setText("feet");
            }
        });
        currencyRadioButton.addActionListener(new ActionListener() { // if selected ...
            @Override
            public void actionPerformed(ActionEvent e) { // change labels to show NAD and USD
                firstLabel.setText("NAD");
                secondLabel.setText("USD");
            }
        });
        temperatureRadioButton.addActionListener(new ActionListener() { // if selected ...
            @Override
            public void actionPerformed(ActionEvent e) { // change labels to show Celsius and Fahrenheit
                firstLabel.setText("Celsius");
                secondLabel.setText("Fahrenheit");
            }
        });
        weightRadioButton.addActionListener(new ActionListener() { // if selected ...
            @Override
            public void actionPerformed(ActionEvent e) { // change labels to show kg and lbs
                firstLabel.setText("kg");
                secondLabel.setText("lbs");
            }
        });
        clearButton.addActionListener(new ActionListener() { // when clicked ...
            @Override
            public void actionPerformed(ActionEvent e) {
                firstText.setText(""); // clear the first text field
                secondText.setText(""); // clear the second text field
            }
        });
    } // end of constructor method

    //    Main method to show the frame
    public static void main(String[] args) {
        JFrame frame = new ConversionGUI("GDSC Converter"); // passing the name to the header of the frame object
        frame.setVisible(true); // ensure it can be seen
    } // end of main method
} // end of ConversionGUI class
