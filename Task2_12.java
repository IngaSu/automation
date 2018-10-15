package task2_12;

import java.util.Scanner;

public class Task2_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ведите размер массива ");
		int size = scan.nextInt();
		int[] mas = new int[size];
		int k = 2;
		int[] mas1 = new int[size + k];
		int i;
		for (i = 0; i < mas.length; i++) {
			System.out.print("Ведите " + i + " элемент");
			mas[i] = scan.nextInt();
		}
		for (i = 0; i < mas.length; i++) {
			mas1[i + k] = mas[i];
			mas[i] = mas1[i];
			System.out.println("Сдвиг на две клетки " + i + "-го элемента " + mas[i]);
		}

	}

}
