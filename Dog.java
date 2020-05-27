/*---------------------------------------
Mqondis Malandvula 			Dog.java

// Learning the class concepts
------------------------------------------*/

public class Dog{
	// instance data as it is defined in a class but outside a method
	private String name;
	private int age;

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public int dogYears(){
		return age * 7;
	}

	public String toString(){
		String message = "Dogs name is " + getName();
		message += ", the dog's age is " + dogYears() + ".";
		return message;
	}


}