package task2_6;

import java.util.Scanner;

public class Task2_6 {

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

		
		int border = (mas.length + 1);
		for (i = 0; i < mas.length; i++) {
			int temp = mas[i];
			
			mas[border+i] = temp;
		System.out.println("������ " + i + " " + "�������� " + mas[i] + " ");
					}
	}
}