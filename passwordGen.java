import java.util.Scanner;

public class passwordGen {

    public static char Number(char[] array) {
        byte random = (byte)(Math.random() * 10);
        return array[random];
    }

    public static char Char(char[] array) {
        byte random = (byte)(Math.random() * 52);
        return array[random];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        int length = scanner.nextInt();

        String passFinal = "";

        try {
            for (int i = 0; i < length; i++) {
                selector = (float)Math.random();
                if (selector < 0.5) {
                    passFinal += Number(numbers);
                } else {
                    passFinal += Char(alphabet);
                }
            }

            System.out.println(passFinal);
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
