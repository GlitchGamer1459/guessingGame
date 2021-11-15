import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class passwordGen {

    public static JFrame frame;
    public static JPanel panel;
    public static JLabel label1;
    public static JLabel label2;
    public static Font font;
    public static JTextField textField = new JTextField(20);
    public static JButton button;

    public static char Number(char[] number) {
        byte random = (byte)(Math.random() * 10);
        return number[random];
    }

    public static char Char(char[] alphabet) {
        byte random = (byte)(Math.random() * 52);
        return alphabet[random];
    }

    public static char SpecChar(char[] special) {
        byte random = (byte)(Math.random() * 8);
        return special[random];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        frame = new JFrame();
        frame.setTitle("Password Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600,500));
        frame.setResizable(false);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,1, 10, 10));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        font = new Font("Sans Serif", Font.PLAIN, 30);

        label1 = new JLabel("Password Generator");
        label1.setFont(font);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2 = new JLabel("Directions: ");
        label2.setFont(font);
        label2.setHorizontalAlignment(JLabel.CENTER);

        textField.setPreferredSize(new Dimension(100,50));
        textField.setFont(new Font("Sans Serif", Font.PLAIN, 30));

        panel.add(label1);
        panel.add(label2);
        panel.add(textField);
        frame.add(panel);

        final char[] special = { '!', '@', '#', '$', '%', '^', '&', '*' };
        final char[] numbers = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        final char[] alphabet = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'
        };

        float selector;

        try {
            System.out.println("Random Password Generator V2");
            System.out.print("Enter the desired length: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Do you want special characters?\nEnter a true/false value: ");
            boolean useSpecial = scanner.nextBoolean();

            String passFinal = "";

            if (!useSpecial) {
                for (int i = 0; i < length; i++) {
                    selector = (float)Math.random();
                    if (selector < 0.5) {
                        passFinal += Number(numbers);
                    } else {
                        passFinal += Char(alphabet);
                    }
                }
            } else {
                for (int i = 0; i < length; i++) {
                    selector = (float)Math.random();
                    if (selector < 0.4) {
                        passFinal += Char(alphabet);
                    } else if (selector >= 0.4 && selector < 0.8) {
                        passFinal += Number(numbers);
                    } else {
                        passFinal += SpecChar(special);
                    }
                }
            }

            System.out.println(passFinal);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
