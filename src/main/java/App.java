
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        getSet ceaser = new getSet();

        System.out.println("WELCOME TO CEASER CIPHER");
        System.out.println(".............................................................");

        System.out.println("\tEnter 1 for encryption\n");
        System.out.println("\tEnter 2 for decryption\n");
        System.out.println("\tEnter 3 to exit the program");
        int choice = scanner.nextInt();

        Encrypt encrypter = new Encrypt();
        Decrypt decrypter = new Decrypt();
        if (choice == 1) {
            System.out.println("Encrypying.....");

            System.out.println("Enter word to encrypt");
            String input = scanner.next();
            System.out.println("Enter key to shift letters");
            int move = scanner.nextInt();
            System.out.println(encrypter.encode(input, move));
        }

        else if (choice == 2) {

            System.out.println("Decrypying.....");

            System.out.println("Enter a name :");
            String message = scanner.next();
            System.out.println("Enter a key :");
            int shiftKey = scanner.nextInt();
            System.out.println(decrypter.decode(message,shiftKey));

        } else {
            System.out.println("Exiting....");
        }


    }


}