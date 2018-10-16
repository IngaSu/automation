package second_main_package;

import homework_8.Tester;

public class SecondMain {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.printAllInfo();
		/*Setter can be used within other package as they have 'Friendly' modifier
		 * tester.setExpirienceInYears(3);
		*tester.setEnglishLevel("Advanced");
		*tester.setSalary(2500);*/
		
		
		//tester.printNameAndSurname();
		
		//System.out.println(tester.returnExperienceInMonths(3));
		
		/* Private method is not available in other package Main class, 
		 * it only can be used in parent class
		System.out.println(tester.getDoubleSalary());*/ 

	}

}
