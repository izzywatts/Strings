import java.util.Scanner;

public class MoreStrings
	{

		public static void main(String[] args)
			{
//			printNames();
//			printSentence();
//			printStats();
			printName();
			}
		public static void printNames()
			{
			System.out.println("What is your name");
			Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
			System.out.println("Hello, " + name );
			}
		public static void printSentence()
			{
			System.out.println("Type a sentence with at least 5 words");
			Scanner userInput2 = new Scanner (System.in);
			String sentence = userInput2.nextLine();
			System.out.println(sentence.replace(" ", ""));
			}
		public static void printStats()
			{
			System.out.println("Type a sentence");
			Scanner userInput3 = new Scanner (System.in);
			String stats = userInput3.nextLine();
			System.out.println(stats.length()+" is the amount of characters in your sentence");
			
			}
		public static void printName()
			{
			String type = "Mullen High School";
				for( int i= 0; i <type.length(); i++)
				{
				System.out.println(type.substring(i,i+1));
				}
			}
}

	
