import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2)); // Grid layout for alignment

        // Create components
        JLabel inputLabel = new JLabel("Enter Temperature:");
        JTextField inputField = new JTextField();
        JButton toCelsiusButton = new JButton("Convert to Celsius");
        JButton toFahrenheitButton = new JButton("Convert to Fahrenheit");
        JLabel resultLabel = new JLabel("Result:");
        JLabel resultValue = new JLabel("");

        // Add action listener for converting to Celsius
        toCelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tempF = Double.parseDouble(inputField.getText());
                    double tempC = (tempF - 32) * 5 / 9; // Formula to convert Fahrenheit to Celsius
                    resultValue.setText(String.format("%.2f °C", tempC));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add action listener for converting to Fahrenheit
        toFahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tempC = Double.parseDouble(inputField.getText());
                    double tempF = (tempC * 9 / 5) + 32; // Formula to convert Celsius to Fahrenheit
                    resultValue.setText(String.format("%.2f °F", tempF));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the frame
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(toCelsiusButton);
        frame.add(toFahrenheitButton);
        frame.add(resultLabel);
        frame.add(resultValue);

        // Make the frame visible
        frame.setVisible(true);
    }
}
