import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Counter Application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel counterLabel = new JLabel("0", SwingConstants.CENTER);
        counterLabel.setFont(new Font("Arial", Font.BOLD, 50)); // Make the label big
        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");
        JButton resetButton = new JButton("Reset");

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        buttonPanel.add(resetButton);

        // Add functionality to buttons
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(counterLabel.getText());
                counterLabel.setText(String.valueOf(count + 1));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(counterLabel.getText());
                counterLabel.setText(String.valueOf(count - 1));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterLabel.setText("0");
            }
        });

        // Add components to the frame
        frame.add(counterLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
