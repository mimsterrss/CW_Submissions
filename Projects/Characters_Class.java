/**
* This is my Character's class where all the characters information is stored. This contains the player's name, age, and gender.
**/
public class Characters {

	//data attributes
	private String name;
	private int age;
	private int gender;
	
	//constructor
	public Characters(String n, int a, int g) {
		
		//declaring variables for each attribute
		name = n;
		age = a;
		gender = g;
		
	}
	
	//functionality
	//getters for name, age, and height
	public String getName(String n) {
		
		return name;
		
	}
	
	public int getAge(int a) {
		
		return age;
		
	}
	
	public double getGender(int g) {
		
		return gender;
		
	}
	
	//setters for name, age, and height
	
	public void setName(String n) {
		
		name = n;
		
	}
	
	public void setAge(int a) {
		
		age = a;
		
	}
	
	public void setGender(int g) {
		
		gender = g;
		
	}

	
}
