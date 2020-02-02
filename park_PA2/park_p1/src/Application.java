import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		// Prompts user for 4 digit integer input.
		System.out.print("Please enter a 4 digit integer to be encrypted: ");
		
		// Allows for user input.
		Scanner fourDigit = new Scanner(System.in);
		
		// Sets the input into a variable.
		int toBeEncrypted = fourDigit.nextInt();

		// Prints out a message include the encrypted code, followed by a new line.
		System.out.printf("The encrypted digits is: %04d \n", Encrypter.encrypt(toBeEncrypted));
		
		// Prompts user for 4 digit 
		System.out.print("Please enter 4 digit integer to be decrypted: ");
		
		int toBeDecrypted = fourDigit.nextInt();
		
		// Prints out a message including the decrypted code, followed by a new line.
		System.out.printf("The decrypted digits is: %04d \n", Decrypter.decrypt(toBeDecrypted));
	}
}