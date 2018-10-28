package commonPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence extends Paragraph implements IPrint {
	private String wording = "Enter any small number ";

	@Override
	public void userEnter() {
		System.out.println(wording);
	}

	@Override
	public ArrayList<String> split(ArrayList<String> text) {
		ArrayList<String> splitToWords = new ArrayList<String>();
		for (String str : text) {
			splitToWords.addAll(Arrays.asList(str.split(" ")));
		}
		return splitToWords;
	}

}
