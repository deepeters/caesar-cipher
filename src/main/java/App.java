import models.CaesarCipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try(Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter shift: ");
            int shift = reader.nextInt();

            reader.nextLine();

            System.out.print("Enter test to encode: ");
            String input = reader.nextLine();

            System.out.println("Encoded text: " + CaesarCipher.encodeString(input, shift));
        }
    }
}