package Task2_4;

import java.util.Scanner;

public class task2_4 {

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
		int zero_counter = 0;
		for (i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				zero_counter = zero_counter + 1;
			}
		}
		System.out.println("���������� ������� ��������� " + zero_counter);

	}

}
