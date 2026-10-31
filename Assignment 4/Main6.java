import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        Frame f = new Frame("AWT Menu Example");

        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);

        f.setSize(400, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}