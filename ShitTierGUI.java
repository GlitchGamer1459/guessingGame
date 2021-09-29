import javax.swing.JOptionPane;

public class ShitTierGUI {

    public static void run(int random) {
        boolean go = true;
        String bigSmall = new String("Enter a Guess:");
        System.out.println(random);
        while (go) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(bigSmall));
            if (input == 5109) {
                JOptionPane.showMessageDialog(null, "Program Stopped");
                go = false;
            } else if (input == random){
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
        try {
            JOptionPane.showMessageDialog(null, "Guess a number from 0-1000");
            run(number);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An Error Occurred.");
        }
    }
}
