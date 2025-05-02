/**
 * This is my Adoption Agency. Puppies and Dogs are free to stay at casa de la Mimi. This is the main class where
 * you can see whether dogs and puppies are adopted, their ages, and names. 
 */

public class AdoptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    //my favorite dog ever
		Dog max = new Dog(15, "Max", true);

    //best puppy eva
		PuppyDog bailey = new PuppyDog(5, "Bailey", true, true);
		
		//identical dogs
		Dog x = new Dog(16, "trigger", true);
		Dog y = new Dog(16, "trigger", true);
		System.out.print(x.equals(y));
		
		//MAX (DOG)
		//printing out Max's (Dog) attributes
		System.out.println(max.getAdoptionStatus());
		max.stateAge();
		System.out.println("");
		
		//testing the increaseAge method
		max.increaseAge();
		max.stateAge();
		System.out.println("");
		
		
		
		//BAILEY (PUPPYDOG)
		//printing out Bailey's (PuppyDog) attributes
		System.out.println(bailey.getAdoptionStatus());
		bailey.stateAge();
		System.out.println("");
		
		//testing the increaseAge method
		bailey.increaseAge();
		bailey.stateAge();
		System.out.println("");
		
		
		System.out.println(max);
		System.out.println(bailey);
		
	}

}
