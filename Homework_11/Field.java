package homework11;

public class Field {
	private int id;
	private int value;

	public Field(int id, int value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Field [id=" + id + ", value=" + value + "]";
	}

}
