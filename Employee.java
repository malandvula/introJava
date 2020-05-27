public class Employee {

String name;
int age, yearsOfService;
static int numberOfEmployees = 0;
boolean isEligibleForRetirement = false;

public Employee(String emplName, int emplAge, int yearsWorked) {
	name = emplName;
	age = emplAge;
	yearsOfService = yearsWorked;

	numberOfEmployees++;
	setisEligibleForRetirement();
	}

public Employee(String emplName, int id){
	name = emplName;
	id = id;
	numberOfEmployees++;
	}

public String getName() {
	return name;
	}

public int getAge() {
	return age;
	}

public int getyearsOfService() {
	return yearsOfService;
	}

public void setName(String name) {
	this.name = name;
	}

public void setAge(int age) {
	this.age = age;
	}

public void setyearOfService(int yearsOfService) {
	this.yearsOfService = yearsOfService;
	}

private void setisEligibleForRetirement(){
	if (age > 55) {
		isEligibleForRetirement = true;
		}
	}

public String toString() {
	String message0 = "\nNumber of employees: " + numberOfEmployees;
	String message = "\nName: " + name;
	String message1 = "\nAge: " + age;
	String message2 = "\nYears of service: " + yearsOfService;
	String message3 = "\nEligible fo retirement: " + isEligibleForRetirement;

	return message0 + message + message1 + message2 + message3;
	}
}