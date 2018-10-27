package homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {
	float id;
	String title;
	
HashMap <Integer,Dropdown> map = new HashMap <Integer,Dropdown>() ;
	
	public void putMap (Integer key, Dropdown dropdown) {
		map.put(key, dropdown);
		}
	public void removeMap (Integer key) {
		map.remove(key);
	}
	public void replaceMap (Integer key, Dropdown dropdown) {
		map.replace(key, dropdown);
	}
	public void printMap () {
		for (Dropdown dropdown: map.values()) {
			System.out.println("Value: " + dropdown);
		}
	}
	
HashSet <Label> label = new HashSet <Label>();

public void addLabel (Label userLabel) {
	label.add(userLabel);
	}
	public void removeLabel (Label userLabel) {
	label.remove(userLabel);
	}

	public void printLabel () {
		for (Label labels:label) {
			System.out.println(labels.toString());
		}
	}

LinkedList<Field> listField = new LinkedList<Field>();

public void offerField (Field field) {
	listField.offer(field);
	}
	public void removeField (Field field) {
	listField.remove(field);
	}

	public void updateField (int position, Field field) {
	listField.set(position, field);
	}

	public void printField () {
		for (Field fieldName:listField) {
			System.out.println(fieldName.toString());
		}
	}

ArrayList<Button> arButton = new ArrayList <Button>();

public void addButton (Button button) {
arButton.add(button);
}
public void removeButton (Button button) {
arButton.remove(button);
}

public void updateButton (int position, Button button) {
arButton.set(position, button);
}

public void printButton () {
	for (Button buttonName:arButton) {
		System.out.println(buttonName.toString());
	}
	
		
	
}
}
