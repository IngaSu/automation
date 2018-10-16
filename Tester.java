package task5_1;

public class Tester {
	private String name;
	private String surname;
	private int expirienceInYears;
	private String englishLevel;
	private int salary;
	public static double salaryCoefficient = 0.354;

	// Static method called in CountSalaryReward class
	public static double countReward(int salary) {
		return salary * salaryCoefficient;
	}

	// Constructors
	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirience, String englishLevel) {
		this(name, surname);
		this.expirienceInYears = expirience;
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int expirience, String englishLevel, int salary) {
		this(name, surname, expirience, englishLevel);
		this.salary = salary;
	}

	// Methods
	public void getTesterDetails(String name, String surname) {
		System.out.println("Student " + name + " " + surname);
	}

	public void getTesterDetails(String name, String surname, String englishLevel) {
		System.out.println("Student " + name + " " + surname + " has " + englishLevel + " level");
	}

	public void getTesterDetails(String name, String surname, String englishLevel, int experience, int salary) {
		System.out.println("Student " + name + " " + surname + " has " + englishLevel + " level, working experience "
				+ expirienceInYears + " and salary " + salary);
	}

}
