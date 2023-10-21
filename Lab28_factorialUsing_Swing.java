import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab28_factorialUsing_Swing extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton calculateButton;

    public Lab28_factorialUsing_Swing() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        inputField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Factorial: ");
        add(new JLabel("Enter a number: "));
        add(inputField);
        add(calculateButton);
        add(resultLabel);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }

    private void calculateFactorial() {
        try {
            int n = Integer.parseInt(inputField.getText());
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            resultLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Lab28_factorialUsing_Swing calculator = new Lab28_factorialUsing_Swing();
            calculator.setVisible(true);
        });
    }
}
