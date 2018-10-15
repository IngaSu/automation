package task2_1;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ведите размер массива ");
		int size = scan.nextInt();
		double[] mas = new double[size];
		int i=0;
		do{
			System.out.print("Ячейка " + i + " ");
		System.out.println(mas[i] = Math.random());
			i++;
		}
		while (i<mas.length-1);
		do{
			System.out.print("Ячейка " + i + " ");
		System.out.println(mas[i] = Math.random());
			i--;
		}
		while (i>=0);
		
		}
}
