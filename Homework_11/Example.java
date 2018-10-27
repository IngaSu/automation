package homework11;

import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		Page page = new Page();
		Button button = new Button ("Save");
		Button button2 = new Button ("Continue");
		Button button3 = new Button ("Buy", "Add to cart");
		Field field = new Field(0, 123); 
		Field field2 = new Field(1, 555);
		Field field3 = new Field(25, 1);
		Label label = new Label ("Book a flight");
		Label label2 = new Label ("Book a home");
		Label label3 = new Label ("Book a car");
		Dropdown dropdown = new Dropdown(false, "Belarus");
		Dropdown dropdown2 = new Dropdown(true, "USA");
		Dropdown dropdown3 = new Dropdown(true, "Japan");
		
		
		page.addButton(button);
		page.removeButton(button);
		page.addButton(button2);
		page.updateButton(0,button3);
		page.printButton();
		page.offerField(field);
		page.removeField(field);
		page.offerField(field2);
		page.updateField(0, field3);
		page.printField();
		page.addLabel(label);
		page.addLabel(label);
		page.addLabel(label2);
		page.addLabel(label3);
		page.removeLabel(label3);
		page.printLabel();
		page.putMap(0, dropdown);
		page.putMap(1, dropdown);
		page.putMap(2, dropdown2);
		page.removeMap(1);
		page.replaceMap(0, dropdown3);
		page.printMap();
	}
}
