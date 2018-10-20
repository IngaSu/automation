package task9_1;

public class Sun extends Star {
	
public Sun(String galaxy, int multiplicity, String name, String type) {
		super(galaxy, multiplicity, name, type);
	}

private int temperature;
private final int mass = 19885;
private String wording1 = "This star named ";
private String wording2 = " , its temperature is ";

public int getHalfMass () {
	return mass/2;
}

public int getTemperature() {
	return temperature;
}

public void setTemperature(int temperature) {
	this.temperature = temperature;
}

@Override
public void printStarSystem() {
	System.out.println(wording1 + getNameOfStarSystem() + wording2 + getTemperature());

}

}
