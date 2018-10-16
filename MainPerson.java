package person;

public class MainPerson {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Inga");
		person.setSurname("Supranovich");
		person.setAge(24);
		person.setPhone(11223344);
		person.printAllInformation();
		System.out.println();
		person.printName();
		System.out.println();
		person.isAdult();
		person.printAge();

	}

}
