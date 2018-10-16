package homework_8;

public class MainTester {

	public static void main(String[] args) {
		Tester tester = new Tester ("Inga", "Supranovich");
		tester.setExpirienceInYears(3);
		tester.setEnglishLevel("Advanced");
		tester.setSalary(2500);
		tester.printNameAndSurname();
		tester.printAllInfo();
		System.out.println(tester.returnExperienceInMonths(3));
		/* Private method is not available in Main class, 
		 * it only can be used in parent class
		System.out.println(tester.getDoubleSalary());*/ 
		

	}

}
