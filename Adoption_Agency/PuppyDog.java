/**
 * This is my sub-class named PuppyDog. This class is strictly for just puppies, not Dogs, puppies.
 * This class basically inherits methods and atrributes from the Dog class.
 */

public class PuppyDog extends Dog {

	//puppy dog attribute to see if the puppy is fed
	protected boolean isFed;
	
	name = n;
	
	//"super" as in super-class
	//inheriting the attributes and methods in the Dog class
	public PuppyDog(int a, String n, boolean ad, boolean f) {
		
		super(a, n, ad);
		isFed = f;
		
	}
	
	//states the puppy's age differently from months instead of years
	public void stateAge() {
		
		System.out.print(name + " is " + age + " months old.");
		
	}
	
	//feeds the pup
	public void feedPup() {
		
		isFed = true;
		
	}
	
	//if the puppy increases in age, fed the pup
	public void increaseAge() {
		
		super.increaseAge();
		isFed = false;
		
	}
	
	//toString takes exactly from the same method as the Dog class
	public String toString() {
		
		super.toString();
		
	}
	
	//using super to take from the dog class
	public boolean equals(PuppyDog lilDawg) {
		
		if(super.equals(lilDawg) && this.isFed == lilDawg.isFed) {
			
			return true;
			
		}
		return false;
		
	}
	
}
