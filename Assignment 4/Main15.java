import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("GridLayout Example");

        f.setLayout(new GridLayout(2, 3));

        for (int i = 1; i <= 6; i++) {
            f.add(new JButton("Button " + i));
        }

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}