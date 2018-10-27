package homework11;

import java.util.List;

public class Dropdown {

	List<String> options;
	boolean isSelected;
	String name;

	public Dropdown(boolean isSelected, String name) {
		this.isSelected = isSelected;
		this.name = name;
	}
	public Dropdown (List<String> options, boolean isSelected, String name) {
		this(isSelected, name);
		this.options = options;
	}

	@Override
	public String toString() {
		return "Dropdown [options=" + options + ", isSelected=" + isSelected + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isSelected ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		return result;
	}

}
