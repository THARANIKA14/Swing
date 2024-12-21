import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        JButton[] buttons = new JButton[9];
        String[] currentPlayer = {"X"};

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
            buttons[i].setFocusPainted(false);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    if (button.getText().isEmpty()) {
                        button.setText(currentPlayer[0]);
                        currentPlayer[0] = currentPlayer[0].equals("X") ? "O" : "X";
                    }
                }
            });

            panel.add(buttons[i]);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
