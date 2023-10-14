import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab27_digitalClock{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        JLabel clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(clockLabel);
        frame.setVisible(true);
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            Date now = new Date();
            String time = sdf.format(now);
            clockLabel.setText(time);
        });
        timer.start();
    }
}

