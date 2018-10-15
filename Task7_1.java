package task7_1;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество строк: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i <= numberOfStrings - 1; i++) {
			System.out.println("Введите строку номер " + (i + 1) + ": ");
			strings[i] = scanner.nextLine();
		}
		String longString = strings[0];
		String shortString = strings[0];
		for (int i = 0; i <= numberOfStrings - 1; i++) {
			if (shortString.length() > strings[i].length()) {
				shortString = strings[i];
			} else if (longString.length() < strings[i].length()) {
				longString = strings[i];
			}
		}
		System.out.println("Самая короткая строка (длина): " + shortString + "(" + shortString.length() + ")");
		System.out.println("Самая длинная строка (длина): " + longString + "(" + longString.length() + ")");
	}
}
