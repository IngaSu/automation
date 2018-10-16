package massive;

public class Massive {
	
public void printMassiveAsLine (int [] masToPrint ) {
	for (int i = 0; i<masToPrint.length; i++) {
		System.out.print (masToPrint[i] + " ");
	}
}
public void printReverseMassiveAsLine (int [] masToPrint ) {
	for (int i = masToPrint.length-1; i>=0; i--) {
		System.out.print (masToPrint[i] + " ");
	}
}

public int getSumOfElements (int [] masToSum ) {
		int sum = 0;
		for (int num : masToSum) {
		    sum  = sum + num;
		}
		System.out.println(sum + " ");
	return sum;
}

public int[] multiptyBy3 (int [] masToMul ) {
	for (int i = 0; i<masToMul.length; i++) {
		masToMul[i] = masToMul[i] * 3;
}
	for (int i = 0; i<masToMul.length; i++) {
		System.out.print(masToMul [i] + " ");
	}
	return masToMul;
}
}