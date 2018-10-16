package homework_8;

public class Tester {
	public String name;
	public String surname;
	int expirienceInYears;
	protected String englishLevel;
	private int salary;
	String empty = " ";

//Constructors

	Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	protected Tester(String name, String surname, int experience, String englishLevel) {
		this(name, surname);
		this.expirienceInYears = experience;
		this.englishLevel = englishLevel;
	}

	public Tester() {
		this(name, surname, experience, englishLevel);
		this.salary = salary;
	}

//Getters / setters available only inside the package
	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	// Private method
	private int getDoubleSalary() {
		return salary * 2;
	}

	// Friendly method
	int returnExperienceInMonths(int i) {
		return expirienceInYears * 12;
	}

    //Protected method
	protected void printNameAndSurname() {
		System.out.println(name + " " + surname);
	}
	
	//Public method
public void printAllInfo () {
	System.out.println(getName()+ empty + getSurname() + empty + getExpirienceInYears() + empty + getEnglishLevel() + empty + getSalary());
}
}
