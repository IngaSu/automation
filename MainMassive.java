package massive;

public class MainMassive {

	public static void main(String[] args) {
		int [] array = {5,99,67, 45, 6,23,19};
		Massive massive = new Massive();
		System.out.print("Ваш первоначальный массив: ");
		massive.printMassiveAsLine(array);
		System.out.println();
		System.out.print("Ваш перевернутый массив: ");
		massive.printReverseMassiveAsLine(array);
		System.out.println();
		System.out.print("Сумма элементов массива: ");
		massive.getSumOfElements(array);
		System.out.print("Массив умноженный на 3 в прямом порядке:");
		massive.multiptyBy3(array);
		System.out.println();
		System.out.print("Массив умноженный на 3 в обратном порядке:");
		massive.printReverseMassiveAsLine(array);
	}
	}
