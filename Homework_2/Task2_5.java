package task2_5;

import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ������ ������� ");
		int size = scan.nextInt();
		int[] mas = new int[size];
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.print("������ " + i + " �������");
			mas[i] = scan.nextInt();
		}
		int not_null_index = 0;
		for (i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				System.out.println("������ �������� �������� " + i);
			} else {
				not_null_index += 1;
			}
			if (not_null_index == mas.length) {
				System.out.println("������� ��������� ��� ");
			}
		}
	}
}
