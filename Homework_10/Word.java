package commonPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Word extends Sentence implements IPrint {

	private String wording = "Enter num of each word that will be replaced with %";

	@Override
	public void userEnter() {
		System.out.println(wording);
	}

	private int number;

	public int scanNumber() {
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		return number;
	}

	private static final String symbol = "%";

	public ArrayList<String> replaceSymbol(ArrayList<String> text) {
		ArrayList<String> replacedSymbolInWord = new ArrayList<String>();
		Sentence sentence = new Sentence();

		for (String word : sentence.split(text)) {
			if (word.codePointAt(number) == number) {
				replacedSymbolInWord.set(number, symbol);
			}

		}
		return replacedSymbolInWord;
	}

}
