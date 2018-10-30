package task_14;

public class Example {

	public static void main(String[] args) {
		Massive mas = new Massive();
	mas.accessToNotExistingIndex("hello", -9);
	mas.storeInvalidType(22);
	mas.catchSomeExeptions(45,45);
	mas.negativeArraySizeExeption(-99);

	}

}
