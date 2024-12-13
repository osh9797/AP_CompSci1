/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);

        System.out.print("Enter an encoded message: ");
        String encodedMessage = sc.nextLine();

        System.out.print("Do you have a key for decoding? (yes/no): ");
        String hasKey = sc.nextLine();

        String decodedMessage;

        if (hasKey.equals("yes")) {
            System.out.print("Enter the key: ");
            double key = Double.parseDouble(sc.nextLine());
            decodedMessage = Cipher.keyedEncode(encodedMessage, (int) key);
        } else {
            decodedMessage = Cipher.encode(encodedMessage);
        }

        System.out.println("Decoded message: " + decodedMessage);
		

	}
}
