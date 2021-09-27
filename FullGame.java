import java.util.Scanner;

public class FullGame {

    //runs the selector scan
    public static void ScanInit(Scanner scanner) {
        byte gameType = scanner.nextByte();
        int random = (int)(Math.random() * 1000);

        if (gameType == 1) {
            System.out.println("You have selected the Guessing Game");
            System.out.println("A random number from 0-1000 has been generated." +
                    "\nEnter a guess within the range and the program will say if it's bigger or smaller.");
            scanner.nextLine();
            Scan1(random, scanner);
        } else if (gameType == 2) {
            System.out.println("Game2");
            scanner.nextLine();
        } else if (gameType == 5109) {
            System.out.println("Game stopped.");
            scanner.nextLine();
        }
    }

    //runs the scan for the guessing game
    public static void Scan1(int random, Scanner scanner) {
        System.out.print("Type a guess in: ");
        try {
            int input = scanner.nextInt();
            if (input < random && input <= 1000 && input >= 0) {
                System.out.println("Bigger");
                scanner.nextLine();
                Scan1(random, scanner);
            } else if (input > random && input <= 1000 && input >= 0) {
                System.out.println("Smaller");
                scanner.nextLine();
                Scan1(random, scanner);
            } else if (input == random && input <= 1000 && input >= 0) {
                System.out.print("Correct!\nYou Win!\nEnter a number from 1-2 to select a game: ");
                scanner.nextLine();
                ScanInit(scanner);
            } else if (input > 1000 || input < 0) {
                if (input == 5109) {
                    System.out.print("Stop key received, stopping...\nStopped.\nEnter a number from 1-2 to select a game: ");
                    scanner.nextLine();
                    ScanInit(scanner);
                } else {
                    System.out.print("Input out of range.");
                    scanner.nextLine();
                    Scan1(random, scanner);
                }
            }
        } catch (Exception e) {
            System.out.println("Please input a whole number from 0-1000.");
            scanner.nextLine();
            Scan1(random, scanner);
        }
    }

    //init function
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1-2 to select a game: ");

        ScanInit(scanner);
    }
}
