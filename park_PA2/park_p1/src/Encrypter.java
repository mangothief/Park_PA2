public class Encrypter
{
	public static int encrypt(int digit)
	{
		// Gets the first digit by dividing it by 1000.
		int firstDigit = (digit / 1000);

		// Gets the second digit by modding it by 1000 then dividing it by 100.
		int secondDigit =(digit % 1000) / 100;

		// Gets the third digit by modding it by 100 then dividing it by 10.
		int thirdDigit = (digit % 100) / 10;

		// Gets the fourth digit by modding it 10.
		int fourthDigit = digit % 10;

		// Adds the first digit by 7 then mods by 10 and multiplied by 10.
		firstDigit = ((firstDigit + 7) % 10) * 10;

		// Adds the second digit by 7 then mods by 10.
		secondDigit = ((secondDigit + 7) % 10);

		// Adds the third digit by 7 then mods by 10 and multiplied by 1000.
		thirdDigit = ((thirdDigit + 7) % 10) * 1000;

		// Adds the fourth digit by 7 then mods by 10 and multiplied by 100.
		fourthDigit = ((fourthDigit + 7) % 10) * 100;


		// Swaps the first digit with the third, then swaps the second with fourth.
		return digit = (thirdDigit + fourthDigit + firstDigit + secondDigit);	
	}
}