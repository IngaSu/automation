package task2_6;

import java.util.Scanner;

public class Task2_6 {

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

		
		int border = (mas.length + 1);
		for (i = 0; i < mas.length; i++) {
			int temp = mas[i];
			
			mas[border+i] = temp;
		System.out.println("Ячейка " + i + " " + "значение " + mas[i] + " ");
					}
	}
}