import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchApp {
    private static int seconds = 0;
    private static boolean running = false;
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel timeLabel = new JLabel("00:00", SwingConstants.CENTER);
        timeLabel.setFont(timeLabel.getFont().deriveFont(50f));
        frame.add(timeLabel, "Center");

        JPanel panel = new JPanel();
        frame.add(panel, "South");

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");
        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    seconds++;
                    int minutes = seconds / 60;
                    int sec = seconds % 60;
                    timeLabel.setText(String.format("%02d:%02d", minutes, sec));
                }
            }
        });

        startButton.addActionListener(e -> {
            running = true;
            timer.start();
        });

        stopButton.addActionListener(e -> {
            running = false;
            timer.stop();
        });

        resetButton.addActionListener(e -> {
            running = false;
            timer.stop();
            seconds = 0;
            timeLabel.setText("00:00");
        });

        frame.setVisible(true);
    }
}
