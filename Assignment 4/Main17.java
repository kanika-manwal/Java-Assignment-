import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("KeyListener Example");

        JLabel l = new JLabel("Press any key");
        l.setBounds(50, 50, 250, 30);

        f.add(l);

        f.addKeyListener(new KeyListener() {

            public void keyPressed(KeyEvent e) {
                l.setText("Key Pressed: " + e.getKeyChar());
            }

            public void keyReleased(KeyEvent e) {}

            public void keyTyped(KeyEvent e) {}
        });

        f.setSize(350, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        f.setFocusable(true);
        f.requestFocusInWindow();
    }
}