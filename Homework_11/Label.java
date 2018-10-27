package homework11;

public class Label {
	private String name;

	public Label(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Label [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}
