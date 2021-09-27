import java.util.Scanner;

public class FullGame {

    public static int gameSel;

    public static void ScanInit(Scanner scanner) {
        byte gameType = scanner.nextByte();

        if (gameType == 1) {
            System.out.println("Game1");
        } else if (gameType == 2) {
            System.out.println("Game2");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1-2 to select a game.");

        ScanInit(scanner);
    }
}
