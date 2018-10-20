package task9_1;

public class Earth extends Planet {
	public Earth(String galaxy) {
		super(galaxy);
		
	}
	private final int RADIUS = 6371;
	private String wording = "Earth readius is ";
	
	public int getDiametr() {
		return RADIUS*2;
	}
	@Override
	public void printStarSystem() {
		System.out.println (wording + RADIUS);
	}
}
