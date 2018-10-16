package task7_3;

import java.util.Scanner;

public class Task7_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i <= numberOfStrings - 1; i++) {
			System.out.println("Enter smth for string number " + (i + 1) + ": ");
			strings[i] = scanner.nextLine();
		}
		int averageLength = 0;
		for (String element : strings) {
			averageLength += element.length() / numberOfStrings;
		}
		System.out.println("Average string lenth is " + averageLength);
		System.out.println("Strings with length less than average are ");
		for (int i = 0; i <= numberOfStrings - 1; i++) {
			if (strings[i].length() < averageLength) {
				System.out.println(strings[i] + " (" + strings[i].length() + ")");
			}
		}
	}
}
