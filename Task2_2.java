package task2_2;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ведите размер массива ");
		int size = scan.nextInt();
		double[] mas = new double[size];
		int i;
		for (i = 0; i < mas.length; i++) {
			mas[i] = Math.random();
		}
		for (double x : mas)
			System.out.println(x + " ");
		{
			double mult = 1;
			for (i = 0; i < size; i++) {
				mult *= mas[i];
			}

			System.out.println("Произведение всех элементов " + mult);

		}
	}
}
