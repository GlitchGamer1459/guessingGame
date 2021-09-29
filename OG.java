import java.util.Scanner;

public class OG {

    //when called, runs a new scan request through the terminal
    public static void Scan(int random, Scanner scanner) {
        System.out.print("Type a guess in: ");
        try {
            int input = scanner.nextInt();
            if (input < random && input <= 1000 && input >= 0) {
                System.out.println("Bigger");
                Scan(random, scanner);
            } else if (input > random && input <= 1000 && input >= 0) {
                System.out.println("Smaller");
                Scan(random, scanner);
            } else if (input == random && input <= 1000 && input >= 0) {
                System.out.print("Correct!\nYou Win!");
            } else if (input > 1000 || input < 0) {
                if (input == 5109) {
                    System.out.print("Stop key received, stopping...\nStopped.");
                } else {
                    System.out.print("Input out of range.");
                    Scan(random, scanner);
                }
            }
        } catch (Exception e) {
            System.out.println("Please input a whole number from 0-1000.");
            scanner.nextLine();
            Scan(random, scanner);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() * 1000);

        System.out.println("A random number from 0-1000 has been generated." +
                "\nEnter a guess within the range and the program will say if it's bigger or smaller.");
        Scan(number, scanner);
    }
}
