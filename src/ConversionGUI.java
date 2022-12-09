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
    double first = 0;
    double second = 0;

    // conversions
    double toFeet = 30.48;
    double toUSD = 0.067;
    double toPound = 2.205;
    public ConversionGUI(String title) { // constructor for the Calculator GUI class - parameter for window title
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes when clicked
        this.setContentPane(secondPanel); // set a reference to the panel for the builder
        this.pack(); // sizes the frame so that all its contents are at or above their preferred sizes

        firstText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                first = Double.parseDouble(firstText.getText());
                String input = "";
                if (heightRadioButton.isSelected()) {
                    second = first / toFeet;
                    input = String.format("%,.2f", second);
                    secondText.setText(input);
                }
                else if (currencyRadioButton.isSelected()) {
                    second = first / toUSD;
                    input = String.format("%,.2f", second);
                    secondText.setText(input);
                }
                else if (temperatureRadioButton.isSelected()) {
                    second = (first * (9/5)) + 32;
                    input = String.format("%,.2f", second);
                    secondText.setText(input);
                }
                else if (weightRadioButton.isSelected()) {
                    second = first * 2.205;
                    input = String.format("%,.2f", second);
                    secondText.setText(input);
                }
            }
        });
        secondText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                second = Double.parseDouble(secondText.getText());
                String input = "";
                if (heightRadioButton.isSelected()) {
                    first = second * toFeet;
                    input = String.format("%,.2f", first);
                    firstText.setText(input);
                }
                else if (currencyRadioButton.isSelected()) {
                    first = second * toUSD;
                    input = String.format("%,.2f", first);
                    firstText.setText(input);
                }
                else if (temperatureRadioButton.isSelected()) {
                    first = (second - 32) * (5/9);
                    input = String.format("%,.2f", first);
                    firstText.setText(input);
                }
                else if (weightRadioButton.isSelected()) {
                    first = second / toPound;
                    input = String.format("%,.2f", first);
                    firstText.setText(input);
                }
            }
        });
        heightRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstLabel.setText("cm");
                secondLabel.setText("feet");
            }
        });
        currencyRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstLabel.setText("NAD");
                secondLabel.setText("USD");
            }
        });
        temperatureRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstLabel.setText("Celsuis");
                secondLabel.setText("Farhenheit");
            }
        });
        weightRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstLabel.setText("kg");
                secondLabel.setText("lb");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstText.setText("");
                secondText.setText("");
            }
        });
    }

    //    Main method to show the frame
    public static void main(String[] args) {
        JFrame frame = new ConversionGUI("GDSC Converter"); // passing the name to the header
        frame.setVisible(true);
    }
}
