import java.util.*;

public class Encryption
{
	public static int shift = 6;
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int c =0;
		do
		{
			System.out.print("Encrypt or Decrypt: ");
			String a = keyboard.nextLine();
			if(a.equalsIgnoreCase("encrypt"))
			{
				System.out.println("Running encryption");
				encryption();
				System.out.println();
			}
			else if(a.equalsIgnoreCase("decrypt"))
			{
				System.out.println("Running Decryption");
				decryption();

			}
			else
			{
				System.out.println("NO");
				c++;
			}
		}
		while(c == 0);
	}
	public static void encryption()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your message: ");
		String origin = keyboard.nextLine();
		//orgin = the original message

		//was tring to make the screen move down
		/*for(int c = 0; c < x + 20; c++)
			System.out.println();*/
		String changed = rotationCipher(origin);
		//changed = rotationCipher(changed);
		System.out.println("Encrypted message = " + changed);
	}
	public static void decryption()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your message: ");
		String origin = keyboard.nextLine();

		int x = origin.length();
		String product = "";

		//decrypts the rotation cipher
		for(int c = 0; c < x; c++)
		{
			char a = origin.charAt(c);
			int b = (int)a;
			b -= shift;
			product += (char)b;
		}
		System.out.println("Decrypted message = " + product);
	}
	public static String rotationCipher(String origin)
	{
		//this for loop is a rotation cipher
		String product = "";
		int x = origin.length();
		for(int c = 0; c < x; c++)
		{
			char a = origin.charAt(c);
			int b = (int)a; //int casting
			b += shift;
			product += (char)b;
		}
		return product;
	}
	/*public static String swapLetter(String origin)
	{
		int x = origin.length();
		String product = "";
		for(int c = 0; c >= 0; c--) {
			char a1 = origin.charAt(x);
			product = a1 + product;
		}
		return product;

	}
	public static String unSwapLetter(String origin) {*/
}