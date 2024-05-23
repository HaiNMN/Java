import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test extends JFrame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int attempt = 1;

        do {
            System.out.print("Input the string " + attempt + ": ");
            input = scanner.nextLine();
            try {
                validateString(input);
                System.out.println("The string is " + input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                attempt++;
            }
        } while (true);

        scanner.close();
    }

    public static void validateString(String str) throws Exception {
        if (!str.matches("SE\\d{3}")) { // SExxx where x is a digit
            throw new Exception("The string is invalid");
        }
    }
}