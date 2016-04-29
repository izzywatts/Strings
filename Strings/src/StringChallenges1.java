import java.util.Scanner;

public class StringChallenges1
	{

		public static void main(String[] args)
			{
			printVoice();
			printLetters();
			printVowels();
			}
		public static void printVoice()
			{
			System.out.println("Shout at me");
			Scanner userInput = new Scanner (System.in);
			String shout = userInput.nextLine();
			System.out.println(shout.substring(0,1)+shout.substring(1).toLowerCase());
			}
		public static void printLetters()
			{
			System.out.println("Type something");
			Scanner userInput1 = new Scanner (System.in);
			String type = userInput1.nextLine();
				for( int i= 0; i <type.length(); i++)
				{
				System.out.println(type.substring(i,i+1));
				}
			}
		public static void printVowels()
			{
			int counter = 0;
			System.out.println("Type a sentence");
			Scanner userInput2 = new Scanner (System.in);
			String sentence = userInput2.nextLine();
			for ( int i= 0; i<sentence.length(); i++)
				{
				switch (sentence.substring(i,i+1))
				{
				case "a":
				case "i":
				case "e":
				case "o":
				case "u":
				case "A":
				case "I":
				case "E":
				case "O":
				case "U":
						{
						counter++;
						}
				}
			}
				if(counter==1)
					{
					System.out.println("There is " + counter + " vowel");
				
					}
				if (counter>1)
						{
						System.out.println("There are " + counter + " vowels");
						}
	}
}
	

				
