
/*Translate from English to Pig Latin
 * Prompt the user to enter a word
 * Translate the text to Pig Latin 
 * 	
 * Display it on the console
 * Ask the user if he/she wants to translate another word
 */

import java.util.*;

public class PigLatinLab6 {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		String choice = "y";

		// user input integer prompt
		System.out.print("Welcome to the Pig Latin Translator! ");
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter a line to be translated: ");
			String line2 = input.nextLine();
			System.out.println();
			System.out.println(translate(line2));
			
			// see if the user wants to continue
			System.out.println("Translate another line?? (y/n): ");
			choice=input.nextLine();
			
			
		}//while
		
	}//main
		
		public static String translate(String line) {
		String translation = "";
		String word;
		int firstSpace = line.indexOf(' ');
		if (firstSpace > 0) {
			word = line.substring(0, firstSpace);
//			line = line.substring(firstSpace + 1);

		} else {
			word = line;
			line = "";
		}
		
		translation += translateWord(word);
		
	return translation;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	
	public static String translateWord(String word) {
		String newWord;

		int vowel = findVowel(word);
		if (vowel == 0) {
			newWord = word + "way";
		} else {
			newWord = word.substring(vowel) + word.substring(0, vowel) + "ay";
		}

		newWord = fixCase(newWord, word);

		return newWord; 
	}

	public static int findVowel(String word1) {
		for (int i = 0; i < word1.length(); i++) {
			char letter = word1.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
				return i;
		}
		return -1;
	}

	public static String fixCase(String newWord, String word2) {
		if (word2.toUpperCase().equals(word2))
			return newWord.toUpperCase();

		if (word2.toLowerCase().equals(word2))
			return newWord;

		String first = newWord.substring(0, 1);
		first = first.toUpperCase();
		String rest = newWord.substring(1);
		rest = rest.toLowerCase();
		return first + rest;
	}
}