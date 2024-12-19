import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select a country: ");
        panel.add(label);

        String[] countries = {"USA", "Canada", "India", "Australia", "UK"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        panel.add(countryComboBox);

        JButton showButton = new JButton("Show Selection");
        JLabel resultLabel = new JLabel("You selected: ");
        panel.add(resultLabel);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                resultLabel.setText("You selected: " + selectedCountry);
            }
        });

        panel.add(showButton);
    }
}
