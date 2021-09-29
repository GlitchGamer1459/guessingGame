import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MehGUI implements ActionListener {

    private int count = 0;
    private JLabel label1;
    private JFrame frame;
    private JPanel panel;
    private JButton button1;

    public MehGUI() {
        frame = new JFrame();
        panel = new JPanel();
        button1 = new JButton("Click");
        label1 = new JLabel("# of clicks: 0");

        button1.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(2, 1));
        panel.add(button1);
        panel.add(label1);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,450));
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MehGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label1.setText("# of clicks: " + count);
    }
}
