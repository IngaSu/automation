package methods;

public class Methods {

	// ����� ���������� �������� a - b
	public static int substraction(int a, int b) {
		return a-b;
	}
	// ����� ���������� ����� a + b + c
	public static int sum (int a, int b, int c) {
		return a + b + c;
	}
	// ����� ���������� ����� ���������� ������
	public static int [] anyMas (int [] anyArray) {
		for (int i=0; i < anyArray.length; i++) {
			}
		return anyArray;
	}
	// ����� ���������� ������ �������
	public static int anyMasLength (int [] anyArrayLength) {
		return anyArrayLength.length;
	}
	// ����� �������� double ������, � ���������� ����� ���������
	public static double sumMasDouble (double [] doubleArray) {
		for ( int i = 0; i < doubleArray.length; i++) {
			double sumMas = sumMas + doubleArray[i];
		}
		return sumMas;

	}
	// ����� �������� float ������, � ���������� ����� ������, ������� ������ 3-� ������� �� -1
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
