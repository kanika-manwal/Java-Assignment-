import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        Frame f = new Frame("My First Window");

        Label l = new Label("Welcome to Java GUI");

        l.setBounds(80, 100, 200, 30);

        f.add(l);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}