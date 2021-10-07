import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class passwordGen {

    public static void File(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An Error Occurred:");
            e.printStackTrace();
        }
    }

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

            File file = new File("history.txt");
            FileWriter writer = new FileWriter("history.txt");
            File(file);

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
            try {
                writer.write(passFinal);
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            System.out.println(passFinal);
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
