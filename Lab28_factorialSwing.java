import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab28_factorialSwing extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;

    public Lab28_factorialSwing() {
        setTitle("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 1));

        inputField = new JTextField();
        JButton calculateButton = new JButton("Calculate Factorial");
        resultArea = new JTextArea();

        add(inputField);
        add(calculateButton);
        add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(inputField.getText());
                    long factorial = calculateFactorial(n);
                    resultArea.setText("Factorial of " + n + " is: " + factorial);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter a valid integer.");
                }
            }
        });
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lab28_factorialSwing().setVisible(true);
            }
        });
    }
}
