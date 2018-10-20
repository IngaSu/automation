package task9_1;

public class Star extends StarSystem {
	private String wording = "I am ";
	private String starType;

	public Star(String galaxy, int multiplicity, String name, String type) {
		super(galaxy, multiplicity, name);
		this.starType = type;
	}

	public String getStarType() {
		return starType;
	}

	public void setStarType(String starType) {
		this.starType = starType;
	}

	@Override
	public void printStarSystem() {
		System.out.println(wording + starType);

	}

}
