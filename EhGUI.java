import javax.swing.*;
import java.awt.*;

public class EhGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("DICK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x2F99AB));

        ImageIcon icon = new ImageIcon("icon.jpg");
        frame.setIconImage(icon.getImage());
    }
}
