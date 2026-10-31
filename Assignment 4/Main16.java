import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("MouseListener Example");

        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);

        p.addMouseListener(new MouseListener() {

            public void mouseEntered(MouseEvent e) {
                p.setBackground(Color.YELLOW);
            }

            public void mouseExited(MouseEvent e) {
                p.setBackground(Color.WHITE);
            }

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });

        f.add(p);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}