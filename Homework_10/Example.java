package commonPackage;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		Paragraph userText = new Paragraph();
		userText.userEnter();
		ArrayList<String> plainText = userText.getTextAsArrayList();
		ArrayList<String> splitedToSentence = userText.split(plainText);
		userText.print();

		
	

	}

}
