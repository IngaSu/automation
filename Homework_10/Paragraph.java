package commonPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Paragraph implements IPrint {
	
	String wording = "Enter any text ";
	
@Override
	public void userEnter() {
		System.out.println(wording);
	}

	public ArrayList<String> getTextAsArrayList() {
		ArrayList<String> text = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
		text.add(scanner.nextLine());}
		return text;
	}
		
	ArrayList<String> split (ArrayList<String> text) {
        ArrayList<String> splitedText = new ArrayList<String>();
        for (String str : text) {
        	splitedText.addAll(Arrays.asList(str.split("\\.")));
        }
         return splitedText;
    }

	@Override
	public void print() {
		System.out.println(split(getTextAsArrayList()));
		
	}
	
}
