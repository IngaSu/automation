package person;

public class Person {
private String name;
private String surname;
private int age;
private int phone;

public void setName (String a) {
	this.name = a;
}
public void setSurname (String b) {
	this.surname = b;
}
public void setAge (int c) {
	this.age = c;
}
public void setPhone (int d) {
	this.phone = d;
}
public String getName () {
	return this.name;
}
public String getSurname () {
	return this.surname;
}
public int getAge () {
	return this.age;
}
public int getPhone () {
	return this.phone;
}
public void printAllInformation() {
	System.out.print("Ваше имя " + name + "," + " " + "ваша фамилия " + surname + ", ваш возраст " + " " + age + ", " + "ваш номер телефона "+ phone);
	
}
public void printName() {
	System.out.print("Ваше имя " + name + "," + " " + "ваша фамилия " + surname);
}
boolean realAge = true;
public boolean isAdult() {
	if (age>18) {
		realAge = true;}
		else {
			realAge = false;}
		return realAge;
	}
public void printAge() {
System.out.println("Вы совершеннолетняя? " + realAge);
}
}