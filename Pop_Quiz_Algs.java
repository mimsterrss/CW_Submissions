
public class pop_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test array to test the methods
		int [] fakeArray = {0, 4, 2, 34, 232, 5};
		
		//number one
		shiftToTheRight(fakeArray);
		System.out.println("");
		
		//number two
		sortArray(fakeArray);
		
	}
	
	
	//Number one
	//Shift everything to right algorithm
	public static void shiftToTheRight(int[] nums) {
		
		//making a new array
		int[] copyArr = new int[nums.length];
		//makes a temporary int to hold the value of the last element--so it doesn't get erased from the code when everything is shifted
		int temp = nums[nums.length-1];

		for(int i= copyArr.length-1; i>0; i--){
					
			//declaring each element's value to the one on the right (shifting the elements)
			copyArr[i] = nums[i-1];
					
		}
				
		//making the first element the temporary int from the fake array
		copyArr[0] = temp;
				
		//printing out array
		for(int num : copyArr) {
					
			System.out.print(num + ", ");
					
		}

	}
		
	
	//Number two
	//Copy sort algorithm
	public static void sortArray(int[] nums) {
		
		for(int i=1; i<nums.length; i++) {
			//making the int, insertion, that equals to the value of the traverser
			int insertion = nums[i];
			//m is used to equal the element before insertion
			int m = i-1;
		
			//m needs to be greater than or equal to AND greater than the insertion number to sort it out
			while(m>=0 && nums[m]> insertion) {
			
				//if the number is smaller than the one in front, the m-- will move it in the correct spot (in front of the bigger value)
				nums[m+1] = nums[m];
				m--;
			
			}
		
			//makes the element after m equals to the insertion
			nums[m+1] = insertion;
		
			//prints out array
			for(int num : nums) {
				
				System.out.print(num + "," + " ");
				
			}

		}
	
	}
	
}
