import java.util.ArrayList;

/** Today is March 12th, 2025 and this is my ArrayList Algorithms Project by Mimi Hall. Through this project, 
 * there are 10 tasks assigned to convert the arrays algorithms to array list algorithms of specific arrays. 
 * This includes, sorting, shifting, and checking arrays for certain ints.
 */

public class arrayListAlgs_Projects {

	public static void main(String[] args) {
		
		//array list used for the whole project
		ArrayList<Integer> ints = new ArrayList<Integer>(); 
		ints.add(6);
		ints.add(0);
		ints.add(2);
		ints.add(7);
		ints.add(10);
		ints.add(5);
		ints.add(5);
		ints.add(0);
		
		//task one
		System.out.println(smallestNumber(ints));
		
		//task two
		System.out.println(smallestNumberIndex(ints));
		
		//task three
		System.out.println(average(ints));
		
		//task four
		System.out.println(evenNumbers(ints));
		
		//task five
		fivesToZeros(ints);
		System.out.println("");
		
		//task six
		System.out.println(threeTimesInARow(ints));
		
		//task seven 
		System.out.print(searchForInt(ints, 3));
		
		//task eight
		backwardsArray(ints);
		System.out.println("");
			
		//task nine
		shiftElements(ints);
		System.out.println("");
		
		//task ten
		sortArray(ints);
		
	}

	//TASK ONE: return the smallest number in the ArrayList
	public static int smallestNumber(ArrayList<Integer> nums) {
		
			//making the minimum the first number in the array
			int min = nums.get(0);
			for(int i=0; i<nums.size()-1; i++) {
			
				//checks if the number in the array is less than the current minimum
				if(nums.get(i)< min) {
					//if the number is smaller than the current minimum, it will change the value of the minimum to the new number
					min = nums.get(1);
				}
			
			}
			//prints the minimum of array
			return min;
		
	}
	
	
	//TASK TWO: return the index of the smallest number in the ArrayList
	public static int smallestNumberIndex(ArrayList<Integer> nums) {
		
		//making the minimum the first number in the array
		int min = nums.get(0);
		//making minimum's index
		int minIndex = 0;
		for(int i=0; i<nums.size()-1; i++) {
			
			//checks if the number in the array is less than the current minimum
			if(nums.get(i)< min) {
				//if the number is smaller than the current minimum, it will become the newest minimum
				min = nums.get(i);
				//logs the index to which number in the array it is 
				minIndex = i;
			}
			
		}
		//prints the minimum's index of the array
		return minIndex;
		
	}
	
	
	//TASK THREE: return the average of all numbers in the ArrayList 
	public static int average(ArrayList<Integer> nums) {
		
		//making a sum to add each number together
		int sum = 0;
		//making the average value of the array
		int avg = 0;
		for(int i=0; i<nums.size(); i++) {
			
			//adds the current sum of the previous numbers to the next one in the array to add up all the numbers
			sum = sum + nums.get(i);
			
		}
		//in order to properly get the average, it takes the sum of the array and divides it by the amount of values in the array
		avg = sum/nums.size();
		//prints the average of the array
		return avg;
		
	}
	
	
	//TASK FOUR: return true if all numbers in the ArrayList are even, and return false otherwise
	public static boolean evenNumbers(ArrayList<Integer> nums) {
		
		//making a count to make sure the for loop goes through and checks the whole array 
		int count = 0;
		for(int i=0; i<nums.size(); i++) {
			
			//checks if the number is even by seeing if it is divisible by two completely
			if(nums.get(i) % 2 == 0) {
				
				//if it is even, add one to the count
				count++;
				
			}
			//checks if the count and the amount of numbers in the array lines up making sure ALL numbers in the array are even
			if(count==nums.size()) {
				
				return true;
				
			}
			
		}
		//if any numbers are odd, it will return false
		return false;
		
	}
	
	
	//TASK FIVE: if the ArrayList ever has two consecutive 5's, change them to 0's
	public static void fivesToZeros(ArrayList<Integer> nums) {
		
		for(int i=0; i<nums.size()-1; i++) {
			
			//checks if any number in the array and the number after both have a value of 5
			if(nums.get(i) == 5 && nums.get(i+1) == 5) {
			
				//if they do, make both values into a zero
				nums.set(i, 0);
				nums.set(i+1, 0);
				
			}
		
		
		}
		
		for(int i=0; i<=nums.size()-1;i++) {
			
			//prints out each number of the array
			System.out.print(nums.get(i));
			System.out.print(",");
			
		}

	}
	
	
	//TASK SIX: return true if any number shows up three times in a row, and return false otherwise
	public static boolean threeTimesInARow(ArrayList<Integer> nums) {
		
		for(int i=0; i<nums.size()-1; i++) {
			
			//this checks if three numbers in a row equal to the same value
			if(nums.get(i) == nums.get(i+1) && nums.get(i+1) == nums.get(i+2)) {
			
				//if anywhere in the array three values in a row equal to the same value, it will return true
				return true;
				
			}
		
		
		}
		//return false otherwise
		return false;
		
	}
	
	
	//TASK SEVEN: pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList
	public static int searchForInt(ArrayList<Integer> nums, int x) {
		
		//making a count to check how many times a value appears in the array
		int count=0;
		for(int i=0; i<nums.size(); i++) {
			
			//checks if any number in the array equals to int x, which needs to be declared ahead of time (adaptable code)
			if(nums.get(i)==x) {
				
				//adds to the count each time the value pops up
				count++;
				
			}
			
		}
		//prints the amount of times the value x is in the array
		return count;
	}
	
	
	//TASK EIGHT: alter an ArrayList so that is the backwards version of the ArrayList initially passed
	public static void backwardsArray(ArrayList<Integer> nums) {
		
		//making a new array 
		int copyArr[] = new int[nums.size()];
		for(int i=0; i<nums.size(); i++) {
			
			//copying the elements over to the new array
			copyArr[i] = nums.get(i);
			
		}
	
		//x is the variable that goes into the copyArr
		int x=0;
		for(int i=nums.size()-1; i>=0; i--) {
			
			//creates the backwards array
			nums.set((i), copyArr[x]);
			x++;
			
		} 
		
		for(int num : nums) {
			
			System.out.print(num + "," + " ");
			
		}
		
	}
	
	
	//TASK NINE: shift all elements in an ArrayList to the right
	public static void shiftElements(ArrayList<Integer> nums){
		
		//making a new array
		int[] copyArr = new int[nums.size()];
		//makes a temporary int to hold the value of the last element--so it doesn't get erased from the code when everything is shifted
		int temp = nums.get(nums.size()-1);

		for(int i= copyArr.length-1; i>0; i--){
			
			//declaring each element's value to the one on the right (shifting the elements to the right)
			copyArr[i] = nums.get(i-1);

		}
		
		//making the first element the temporary int (last value in previous array)
		copyArr[0] = temp;
		
		//printing out array
		for(int num : copyArr) {
			
			System.out.print(num + " ");
			
		}


	}
	
	//TASK TEN 
	public static void sortArray(ArrayList<Integer> nums) {
		
		for(int i=1; i<nums.size(); i++) {
			//making the int, insertion, that equals to the value of the element it's on
			int insertion = nums.get(i);
			//m is used to equal the element before insertion
			int m = i-1;
		
			//m needs to be greater than or equal to AND greater than the insertion number to sort it out
			while(m>=0 && nums.get(m)> insertion) {
			
				//if the number is smaller than the one in front, the m-- will move it in the correct spot (in front of the bigger value)
				nums.set((m+1), nums.get(m));
				m--;
			
			}
		
			//the value of the element after m is equal to the insertion
			nums.set((m+1), insertion);
		
			//prints out array
			for(int num : nums) {
				
				System.out.print(num + "," + " ");
				
			}

		}
		
	}

}
