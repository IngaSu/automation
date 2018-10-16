package task7_1;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ���������� �����: ");
		int numberOfStrings = scanner.nextInt();
		String[] strings = new String[numberOfStrings];

		for (int i = 0; i <= numberOfStrings - 1; i++) {
			System.out.println("������� ������ ����� " + (i + 1) + ": ");
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
		System.out.println("����� �������� ������ (�����): " + shortString + "(" + shortString.length() + ")");
		System.out.println("����� ������� ������ (�����): " + longString + "(" + longString.length() + ")");
	}
}
