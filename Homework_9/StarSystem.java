package task9_1;

public abstract class StarSystem {
	private String galaxy;
	private int galaxyMultiplicity;
	private String nameOfStarSystem;

	public StarSystem(String galaxy) {
		this.galaxy = galaxy;
	}

	public StarSystem(String galaxy, int multiplicity, String name) {
		this(galaxy);
		this.galaxyMultiplicity = multiplicity;
		this.nameOfStarSystem = name;
	}

	public abstract void printStarSystem();

	public String getNameOfStarSystem() {
		return nameOfStarSystem;
	}

	public void setNameOfStarSystem(String nameOfStarSystem) {
		this.nameOfStarSystem = nameOfStarSystem;
	}
}
