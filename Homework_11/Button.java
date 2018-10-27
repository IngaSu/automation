package homework11;

public class Button {
	private String name;
	private String action;
	
	public Button (String name) {
		this.name = name;
	}
	public Button (String name, String action) {
		this (name);
		this.action = action;
	}
	@Override
	public String toString() {
		return "Button [name=" + name + ", action=" + action + "]";
	}

}
