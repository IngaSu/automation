package massive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Massive {
	
	Double[] mas = new Double [5];
	String str1;
	String str2;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Massive other = (Massive) obj;
		if (str1 == null) {
			if (other.str1 != null)
				return false;
		} else if (!str1.equals(other.str1))
			return false;
		if (str2 == null) {
			if (other.str2 != null)
				return false;
		} else if (!str2.equals(other.str2))
			return false;
		return true;
	}
	
	public Double [] sortMassiveAsc(Double [] massive) {
		this.mas = massive;
		Arrays.sort(mas);
		for (int i = 0; i < mas.length; i++) {
		}
		System.out.println(Arrays.toString(mas));
		return mas;
	}
	public Double[] sortMassiveDesc(Double[] integers) {
		this.mas = integers;
		Arrays.sort(mas, Collections.reverseOrder());
		for (int i = 0; i < mas.length; i++) {
		}
		System.out.println(Arrays.toString(mas));
		return mas;
	}
	
	public String concatStrings (String firstString, String secondString) {
		String result = firstString.concat(secondString);
		return result;
	}
	
	public String toUpperCase (String string) {
		String result = string.toUpperCase();
		return result;
	}
	public Double[] factorEachElement(Double[] doubles, int factor) {
		this.mas = doubles;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = mas[i] * factor;
		}
		System.out.println(Arrays.toString(mas));
		return mas;
	}
	public boolean compareStrings (String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		boolean result = false;
		if (str1.equals(str2)) {
			result = true;
		}
		return result;
	}
	public String scanUserString () {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter any string");
		if (scanner.hasNext()) {
		String result = scanner.nextLine();
		return  result;}
		return null;
	}
	public String createHardcodedString () {
		String result = "This is hardcoded string";
		return result;
	}
	public Double[] divideMas(Double [] massive, int divider) {
		this.mas = massive;
			for (int i = 0; i < mas.length; i++) {
				mas[i] = mas[i] / divider;
			}
		return mas;
	}
	public String replaceSybmbol (String str) {
		String replaced = str.replace("a", "%");
		return  replaced;
	}
	public char returnCharAt (String str, int position) {
		char ch = str.charAt(position);
		return  ch;
	}
}
