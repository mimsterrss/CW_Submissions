/**
 * This is my super-class named Dog. This class is strictly for just Dogs, not puppies, Dogs.
 */

public class Dog {

	//dog attributes 
	//protected, not private
	protected int age;
	
	protected String name;
	
	protected boolean isAdopted;
	
	//ad = adoption status of the dog
	public Dog(int a, String n, boolean ad) {
		
		age = a;
		//assign THIS dog's name to the name that was previously passed
		this.name = name;
		isAdopted = ad;
		
	}
	
	//states the method isAdopted
	public boolean getAdoptionStatus() {
		
		return isAdopted;
		
	}
	
	//states how old the dog is
	public void stateAge() {
		
		System.out.print(name + " is " + age + " years old.");
		
	}
	
	//increase age by years
	public void increaseAge() {
		
		age++;
		
	}
	
	//printing out the statements of name, age, and adoption status
	public String toString() {
		
		stateAge();
		if(isAdopted) {
			
			return("I have been adopted!!");
			
		}
		else {
			
			return("I haven't been adopted yet, but I am excited about meeting a new family!");
			
		}
		
	}
	
	//object override
	public boolean equals(Dog dawg) {
		
		//make sure if there are any identical dogs to return true instead of false
		if(this.age == dawg.age && this.name.equals(dawg.name) && this.isAdopted == dawg.isAdopted) {
			
				return true;
			
		}
		return false;
		
	}
	
}


