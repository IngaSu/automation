package task7_5;

import java.util.Scanner;

public class Task7_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of words: ");
		int numberOfWords = scanner.nextInt();
		String[] words = new String[numberOfWords];
		for (int i = 0; i <= numberOfWords - 1; i++) {
			System.out.println("Enter word " + (i + 1) + ": ");
			words[i] = scanner.next();
		}
		int counter = 0;
		char[] chArray;
		int vowels_count = 0;
		int consonents_count = 0;
		System.out.println("Words that contain only latin symbols: ");
		for (int i = 0; i <= numberOfWords - 1; i++) {
			if (words[i].matches("^[a-zA-Z]+")) {
				counter++;
			System.out.println(" " + words[i]);}
			chArray = words[i].toCharArray();
			for (int j = 0; j < chArray.length; j++) {
				if (chArray[j] == 'a' || chArray[j] == 'e' || chArray[j] == 'i' || chArray[j] == 'o'
						|| chArray[j] == 'u')
					vowels_count++;
				else
					consonents_count++;
			}

		}
		System.out.println("Number of vowels " + vowels_count + " and consonents " + consonents_count);
	}

}
