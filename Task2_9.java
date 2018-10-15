package task2_9;

import java.util.Scanner;

public class Task2_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ведите размер массива ");
		int size = scan.nextInt();
		int[] mas = new int[size];
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.print("Ведите " + i + " элемент");
			mas[i] = scan.nextInt();
		}
		int max = 0;
		for (i = 0; i < mas.length; i++) {
			if (max < mas[i])
				max = mas[i];
		}
		for (i = 0; i < mas.length; i++) {
			if (mas[i] == max)
				System.out.println("Индекс максимального элемента " + i);
		}
	}
}
