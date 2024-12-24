import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openButton = new JButton("Open Image");
        openButton.addActionListener(e -> openImage(frame));

        frame.add(openButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public static void openImage(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(file));
                JLabel label = new JLabel(imageIcon);
                JFrame imageFrame = new JFrame();
                imageFrame.setSize(600, 600);
                imageFrame.add(label);
                imageFrame.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
