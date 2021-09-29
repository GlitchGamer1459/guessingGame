package construct;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame() {

        this.setTitle("DICK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0x2F99AB));
    }
}
