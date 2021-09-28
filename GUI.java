import javax.swing.JOptionPane;

public class GUI {

    public static void run(int random) {
        boolean go = true;
        String bigSmall = new String("Enter a Guess:");
        System.out.println(random);
        while (go) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(bigSmall));
            if (input == random){
                JOptionPane.showMessageDialog(null, "You Win!");
                go = false;
            } else if (input < random) {
                bigSmall = "Bigger";
            } else if (input > random) {
                bigSmall = "Smaller";
            }
        }
    }

    public static void main(String[] args) {
        int number = (int)(Math.random() * 1000);

        JOptionPane.showMessageDialog(null, "Guess a number from 0-1000");
        run(number);
    }
}
