package massive;

public class MainMassive {

	public static void main(String[] args) {
		int [] array = {5,99,67, 45, 6,23,19};
		Massive massive = new Massive();
		System.out.print("��� �������������� ������: ");
		massive.printMassiveAsLine(array);
		System.out.println();
		System.out.print("��� ������������ ������: ");
		massive.printReverseMassiveAsLine(array);
		System.out.println();
		System.out.print("����� ��������� �������: ");
		massive.getSumOfElements(array);
		System.out.print("������ ���������� �� 3 � ������ �������:");
		massive.multiptyBy3(array);
		System.out.println();
		System.out.print("������ ���������� �� 3 � �������� �������:");
		massive.printReverseMassiveAsLine(array);
	}
	}
