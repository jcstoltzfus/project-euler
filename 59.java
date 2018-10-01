//import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class XORCrypter 
{

		
	public static void main(String[] args) 
	{
		//help();
		//readtest("test.txt");

		/*
		System.out.println(getKey('x'));
		byte[] b = args[0].getBytes();
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		*/

		//xorSimple("01010101", "10101010");
		switch (args[0].toLowerCase())
		{
			case "help":
				help();
				break;
			case "readtest":
				System.out.println(readtest(args[1]));
				break;
			case "xor":
				xorComplex(args[1], args[2]);
				break;
			case "analyze":
				analyze(args[1], Integer.parseInt(args[2]));
				break;
			default: 
				throw new IllegalArgumentException("Invalid command: " + args[0]);	
		}
	}

	public static void help()
	{
		System.out.println("Uses: \n"
				+ "help -- get help \n"
				+ "readtest <filepath> -- cat a file to prove that you can read files \n"
				+ "xor <filepath> <cipher> -- XOR text in file wth cipher \n"
				+ "analyze <filepath> <num buckets> -- give character frequencies for text in file for each bucket");
	}
	
	public static String readtest(String file)
	{
		Scanner scan = null;
		try 
		{
			scan = new Scanner(new File(file));
		}
		catch (Exception e) 
		{
			System.out.println("Sory, but I was unable to open your file!");
		}

		String text = scan.useDelimiter("\\Z").next();
		scan.close();
		return text;
	}
	
	public static void xorSimple(String arg1, String arg2)
	{
		for (int i = 0; i < arg1.length(); i++)
		{
			System.out.print(arg1.charAt(i) ^ arg2.charAt(i));
		}
		System.out.println();
	}
	
	public static void xorComplex(String file, String key)
	{
		/*
		Scanner scan = null;
		try
		{
			scan = new Scanner (new File (file));
		}
		catch (Exception e)
		{
			System.out.println("Sorry, I couldn't find the file you tried to xor!");
		}
		
		String nextline = scan.nextLine();
		*/

		String data = readtest(file);
		// System.out.println(data);
		String newkey = "";
		while (newkey.length() < data.length())
		{
			newkey += key;
		}
		newkey = newkey.substring(0, data.length());
		// System.out.println(newkey);

		byte[] b = newkey.getBytes(); // key array
		byte[] b2 = data.getBytes(); // file array
		byte[] b3 = new byte[b.length]; // final array for xor'ed key and file characters (well, bytes)

		for (int i = 0; i < b.length; i++) // xor these two arrays and put the results of each xor operation into b3
		{
			b3[i] = (byte) (b2[i] ^ b[i]);
		}
		String finalstring = new String(b3); // make a string of the b3, print it out
		System.out.println(finalstring);
	}

	public static void analyze(String filepath, int numBuckets)
	{
		String[] data = readtest(filepath);
		String[] parts = data.split("\\,");
		int[][] a = new int[numBuckets][256];
		int[] maxes = new int[numBuckets];

		//loop through data and separate each letter into its corresponding bucket
		for (int i = 0; i < parts.length(); i++)
		{
			int dat = parts[i];
			a[i % numBuckets][dat] ++;
		}

		//loop through buckets and determine the max char (currently an int) in each; put that max into maxes
		for(int i = 0; i < numBuckets; i++)
		{
			int max = 0;
			int maxpos = 0;
			for(int j = 0; j < 256; j++)
			{
				if(a[i][j] > max)
				{
					max = a[i][j];
					maxpos = j;
				}
			}
			maxes[i] = maxpos; //max of a[i][]
		}

		System.out.println("Final key: ");
		for (int i = 0; i < numBuckets; i++)
		{
			System.out.print((char)(maxes[i] ^ 32));
		}
		System.out.println();
	}
}	