package task2_3;

import java.util.Scanner;

public class task2_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ведите размер массива ");
		int size = scan.nextInt();
		int[] mas = new int[size];
		int i;
		for (i = 0; i < mas.length; i++) {
		System.out.print("Ведите " + i + " элемент");
		mas[i] = scan.nextInt();}
		
		for (i=0; i<size; i+=3) {
			mas[i]= mas[i] * 2;
			System.out.println("Произведение элемента умноженное на '2' равно " + mas[i]);
				}
		System.out.println();
	}
	}

