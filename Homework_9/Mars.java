package task9_1;

public class Mars extends Planet{
	
public Mars(String galaxy) {
		super(galaxy);
	}

private final int RADIUS = 3390;
private String satellite;
	
	public int getDiametr() {
		return RADIUS*2;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}
	private String wording1 = "Diametr of Mars is ";
	private String wording2 = " Satellits of Mars are ";
	
	@Override
	public void printStarSystem() {
		System.out.println (wording1 + getDiametr() + wording2+ getSatellite());
	}

}
