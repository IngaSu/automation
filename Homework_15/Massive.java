package task_15;

import java.util.Arrays;
import java.util.Collections;

public class Massive {

	int[] mas = new int[5];
	Integer[] mas2 = new Integer[3];
	String wording;

	@Override
	public String toString() {
		return "Massive [mas=" + Arrays.toString(mas) + "]";
	}

	public int[] sortMassiveAsc(int[] massive) {
		this.mas = massive;
		Arrays.sort(mas);
		for (int i = 0; i < mas.length; i++) {
		}
		System.out.println(Arrays.toString(mas));
		return mas;
	}

	public Integer[] sortMassiveDesc(Integer[] integers) {
		this.mas2 = integers;
		Arrays.sort(mas2, Collections.reverseOrder());
		for (int i = 0; i < mas2.length; i++) {
		}
		System.out.println(Arrays.toString(mas2));
		return mas2;
	}

	public int[] divideMas(int[] massive, int divider) {
		this.mas = massive;
		try {

			for (int i = 0; i < mas.length; i++) {
				mas[i] = (int) mas[i] / divider;
			}
		} catch (ArithmeticException ex) {
			System.out.println("I caught the Arithmetic Exeption " + ex.getMessage().toString());
		}
		return mas;
	}

	public Integer[] doubleEachElement(Integer[] integers, int factor) {
		this.mas2 = integers;
		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = mas2[i] * factor;
		}
		System.out.println(Arrays.toString(mas2));
		return mas2;
	}

	public Integer[] sumNeibourElements(Integer[] integers) {
		this.mas2 = integers;
		for (int i = 0; i < mas2.length - 1; i++) {
			mas2[i] = mas2[i] + mas2[i + 1];
		}
		return mas2;
	}
}
