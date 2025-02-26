import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel amountLabel = new JLabel("Enter Amount:");
        amountLabel.setBounds(10, 20, 100, 25);
        panel.add(amountLabel);

        JTextField amountField = new JTextField(10);
        amountField.setBounds(120, 20, 150, 25);
        panel.add(amountField);

        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(10, 60, 100, 25);
        panel.add(fromLabel);

        JComboBox<String> fromCurrency = new JComboBox<>(new String[]{"USD", "EUR", "INR"});
        fromCurrency.setBounds(120, 60, 150, 25);
        panel.add(fromCurrency);

        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(10, 100, 100, 25);
        panel.add(toLabel);

        JComboBox<String> toCurrency = new JComboBox<>(new String[]{"USD", "EUR", "INR"});
        toCurrency.setBounds(120, 100, 150, 25);
        panel.add(toCurrency);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(10, 140, 100, 25);
        panel.add(convertButton);

        JLabel resultLabel = new JLabel("Converted: ");
        resultLabel.setBounds(10, 180, 300, 25);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    String from = (String) fromCurrency.getSelectedItem();
                    String to = (String) toCurrency.getSelectedItem();

                    double conversionRate = 1.0;
                    if (from.equals("USD") && to.equals("INR")) conversionRate = 74.5;
                    else if (from.equals("USD") && to.equals("EUR")) conversionRate = 0.85;
                    else if (from.equals("EUR") && to.equals("USD")) conversionRate = 1.18;
                    else if (from.equals("EUR") && to.equals("INR")) conversionRate = 87.0;
                    else if (from.equals("INR") && to.equals("USD")) conversionRate = 0.013;
                    else if (from.equals("INR") && to.equals("EUR")) conversionRate = 0.011;

                    double convertedAmount = amount * conversionRate;
                    resultLabel.setText("Converted: " + convertedAmount + " " + to);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid amount!");
                }
            }
        });
    }
}
