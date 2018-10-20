package task9_1;

public class Example {

	public static void main(String[] args) {

		Star star = new Star("Milky Way", 6, "Centaur", "Red giant");
		star.printStarSystem();

		Sirius sirius = new Sirius("Milky way", 2, "Sirius", "White dwarf");
		sirius.setTemperature(9940);
		sirius.setConstellation("Big dog");
		sirius.setNameOfStarSystem("Sirius");
		sirius.printStarSystem();

		Sun sun = new Sun("Milky way", 1, "Sun", "Yellow dwarf");
		sun.setTemperature(1500000);
		System.out.println("Halfmass of the sun equals to " + sun.getHalfMass());
		sun.printStarSystem();

		Planet mars2 = new Planet("Milky way");
		mars2.setPalnetColor("Red");
		mars2.setPlanetName("Mars");
		mars2.printStarSystem();

		Mars mars = new Mars("Milky way");
		mars.setSatellite("Fobos and Deimos");
		mars.printStarSystem();

		Earth earth = new Earth(null);
		earth.setPlanetName("Earth");
		earth.setPalnetColor("Blue");
		earth.printStarSystem();
	}

}
