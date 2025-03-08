import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"Name", "Age", "City"};
        String[][] data = {
                {"John", "25", "New York"},
                {"Sara", "30", "Los Angeles"},
                {"Mike", "35", "Chicago"}
        };

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
