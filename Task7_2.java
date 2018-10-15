package task7_2;

import java.util.Scanner;

public class Task7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¬ведите количество строк: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i <= numberOfStrings - 1; i++) {
			System.out.println("¬ведите строку номер " + (i + 1) + ": ");
			strings[i] = scanner.nextLine();
		}
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1 - i; j++) {
				if (strings[j].length() > strings[j + 1].length()) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
			System.out.println("”пор€доченный массив строк по возростанию длинны равен ");
			for (String element : strings) {
				System.out.println(element + " (" + element.length() + ")");
			}
		}
	}
}
