package task9_1;

public class Sirius extends Star {
	private int temperature;
	private String constellation;
	private String wording1 = "This star named ";
	private String wording2 = " , its temperature is ";
	private String wording3 = " and it related to constellation of ";

	public Sirius(String galaxy, int multiplicity, String name, String type) {
		super(galaxy, multiplicity, name, type);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	@Override
	public void printStarSystem() {
		System.out.println(wording1 + getNameOfStarSystem() + wording2 + getTemperature() + wording3 + getConstellation());

	}
}
