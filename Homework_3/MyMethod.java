package homework3;

public class MyMethod {
public static void main(String[] args) {
	
		int c = (int) (Math.random() * 101);
		int d = (int) (Math.random() * 33 + 3);
		int resultMin = findMin (c,d);
		System.out.println("Минимальное число из рандомно сгенерированных " + resultMin);
		boolean resultParity = parity (c);
		System.out.println("Является ли число четным? " + c + " " + resultParity);
		int resultSqrt = sqrt (d);
		System.out.println("Твое число возведенное в квадрат равно " + resultSqrt);
		int resultCube = cube (c);
		System.out.println("Твое число возведенное в куб равно " + resultCube);
		
	}
		public static int findMin(int a, int b) {
		int min;
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		return min;
	}
	
	public static boolean parity (int a) {
		boolean result = true;
		if (a%2 == 0) {
			result = true;}
		else {
			result = false;}
		return result;	
		}
	public static int sqrt (int a) {
		return a * a;
	}
	public static int cube (int a) {
		return a * a * a;
	}
}
