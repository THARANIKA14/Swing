import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Select your favorite color: ");
        panel.add(label);

        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton greenButton = new JRadioButton("Green");
        JRadioButton blueButton = new JRadioButton("Blue");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(greenButton);
        group.add(blueButton);

        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);

        JLabel resultLabel = new JLabel("Your selected color will appear here.");
        panel.add(resultLabel);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected Red.");
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected Green.");
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You selected Blue.");
            }
        });
    }
}
