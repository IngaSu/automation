package task_14;

public class Massive {
	private int size;
	private String word;
	private int arSize;
	private int[] arrayOfInts = new int[size];
	private String [] array;
	
	private Object[] massive = new String[3];

	public void storeInvalidType(int a) {
		try {
			massive[0] = new Integer(a);
		} catch (ArrayStoreException ex) {
			ex.printStackTrace();
		}
	}
	
	public void negativeArraySizeExeption (int arraySize) {
	
		try {array = new String [arraySize];
			System.out.println("Your array size is " + arraySize);
	}
		catch (NegativeArraySizeException ex) {
			System.out.println(ex.getMessage().toString());
			}
	}

	public void catchSomeExeptions(int size, int denominator) {
		this.size = size;
		try {
		System.out.println(arrayOfInts[size/denominator]);
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println (ex.getMessage());
			ex.printStackTrace();
	}
	}

	public void accessToNotExistingIndex(String word, int i) {
		this.word = word;
		try {
			System.out.println(word.charAt(i));
		} catch (StringIndexOutOfBoundsException x) {
			System.out.println("I caught the exeption " + x.getMessage().toString());
		} finally {
			System.out.println("But finally executed this anyway");
		}
	}
}