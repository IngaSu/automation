package methods;

public class Methods {

	// Метод возвращает разность a - b
	public static int substraction(int a, int b) {
		return a-b;
	}
	// Метод возвращает сумму a + b + c
	public static int sum (int a, int b, int c) {
		return a + b + c;
	}
	// Метод возвращает любой переданный массив
	public static int [] anyMas (int [] anyArray) {
		for (int i=0; i < anyArray.length; i++) {
			}
		return anyArray;
	}
	// Метод возвращает длинну массива
	public static int anyMasLength (int [] anyArrayLength) {
		return anyArrayLength.length;
	}
	// Метод получает double массив, и возвращает сумму элементов
	public static double sumMasDouble (double [] doubleArray) {
		for ( int i = 0; i < doubleArray.length; i++) {
			double sumMas = sumMas + doubleArray[i];
		}
		return sumMas;

	}
	// Метод получает float массив, и возвращает новый массив, заменив каждый 3-й элемент на -1
	public static float[] newMasFloat (float [] masFloat) {
		float [] newFloat = new float [masFloat.length];
		for ( int i = 0; i < masFloat.length; i+=3) {
			newFloat[i] = masFloat[i]; 
			int x = -1;
			masFloat[i+3] = x;
		}
		return newFloat;
}
}

	}
