package task9_1;

public class Planet extends StarSystem {
	
	public Planet(String galaxy) {
		super(galaxy);
	}

	private String planetName;
	private String palnetColor;
	private String wording1 = "Planet name is ";
	private String wording2 = " and color is ";

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public String getPalnetColor() {
		return palnetColor;
	}

	public void setPalnetColor(String palnetColor) {
		this.palnetColor = palnetColor;
	}

	@Override
	public void printStarSystem() {
		System.out.println(wording1 + planetName + wording2 + palnetColor);
		
	}

}
