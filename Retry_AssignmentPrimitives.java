
public class Practicing_Systems_and_Primatives {

	public static void main(String[] args) {
		//Task 1: Print your name using the letter "O" in ASCII Art
		System.out.println("OO       OO    O    OO       OO    O");
		System.out.println("O  O    O O    O    O  O    O O    O");
		System.out.println("O   O  O  O    O    O   O  O  O    O");
		System.out.println("O    OO   O    O    O    OO   O    O");
		System.out.println("O         O    O    O         O    O");
		System.out.println("O         O    O    O         O    O");
		System.out.println("O         O    O    O         O    O");
		
		//Task 2: Write code to compute the following math problem: 
		// 6.0 x 3.5 - 1.5 x 5
		// -------------------
	    //     55.6 - 30.2

		System.out.println(((6.0*3.5)-(1.5*5))/(55.6-30.2));
		
		//Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.1519 and it never changes)
		final double pi= 3.1519;
		double ci=(2.0*4.0);
		int ar=(4*4);
		System.out.print("The circumference of the circle is ");
		System.out.print(ci*pi);
		System.out.print(" and the area of the circle is ");
		System.out.print(ar*pi);

	}

}
