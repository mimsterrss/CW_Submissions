/** Today is March 10th, 2025 and this is my Algorithms Project by Mimi Hall. Through this project, 
 * there are 10 tasks assigned to create algorithms of specific arrays. This includes, sorting, shifting, 
 * and checking arrays for certain ints.
 */

public class Algs_Project {

	public static void main(String[] args) {
		
		//test array to test the methods
		int [] testArr = {20, 5, 5, 3, 3, 3, 10};
		
		//task one
		System.out.println(smallestNumber(testArr));
		
		//task two
		System.out.println(smallestNumberIndex(testArr));
		
		//task three
		System.out.println(average(testArr));
		
		//task four
		System.out.println(evenNumbers(testArr));
		
		//task five
		fivesToZeros(testArr);
		System.out.println("");
		
		//task six
		System.out.println(threeTimesInARow(testArr));
		
		//task seven
		System.out.println(searchForInt(testArr, 3));
		
		//task eight
		backwardsArray(testArr);
		//prints each element of the array
		for(int i=0; i<testArr.length; i++) {
			
			System.out.print(testArr[i]);
			System.out.print(",");
			
		}
		System.out.println("");
		
		//task nine
		shiftElements(testArr);
		System.out.println("");
		
		//task ten
		sortArray(testArr);
		System.out.println("");
		
		
	}
	
	//task one: return the smallest number in the array
	public static int smallestNumber(int[] nums) {
		
		//making the minimum the first number in the array
		int min = nums[0];
		for(int i=0; i<nums.length-1; i++) {
			
			//checks if the number in the array is less than the current minimum
			if(nums[i]< min) {
				//if the number is smaller than the current minimum, it will change the value of the minimum to the new number
				min = nums[i];
			}
			
		}
		//prints the minimum of array
		return min;
		
	}
	
	
	//task two: return the index of the smallest number in the array
	public static int smallestNumberIndex(int[] nums) {
		
		//making the minimum the first number in the array
		int min = nums[0];
		//making minimum's index
		int minIndex = 0;
		for(int i=0; i<nums.length-1; i++) {
			
			//checks if the number in the array is less than the current minimum
			if(nums[i]< min) {
				//if the number is smaller than the current minimum, it will become the newest minimum
				min = nums[i];
				//logs the index to which number in the array it is 
				minIndex = i;
			}
			
		}
		//prints the minimum's index of the array
		return minIndex;
		
	}
	
	
	//task three: return the average of all numbers in the array 
	public static int average(int[] nums) {
		
		//making a sum to add each number together
		int sum = 0;
		//making the average value of the array
		int avg = 0;
		for(int i=0; i<nums.length; i++) {
			
			//adds the current sum of the previous numbers to the next one in the array to add up all the numbers
			sum = sum + nums[i];
			
		}
		//in order to properly get the average, it takes the sum of the array and divides it by the amount of values in the array
		avg = sum/nums.length;
		//prints the average of the array
		return avg;
		
	}
	
	
	//task four: return true if all numbers in the array are even, and return false otherwise
	public static boolean evenNumbers(int[] nums) {
		
		//making a count to make sure the for loop goes through and checks the whole array 
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			
			//checks if the number is even by seeing if it is divisible by two completely
			if(nums[i] % 2 == 0) {
				
				//if it is even, add one to the count
				count++;
				
			}
			//checks if the count and the amount of numbers in the array lines up making sure ALL numbers in the array are even
			if(count==nums.length) {
				
				return true;
				
			}
			
		}
		//if any numbers are odd, it will return false
		return false;
		
	}
	
	
	//task five: if the array ever has two consecutive 5's, change them to 0's
	public static void fivesToZeros(int[] nums) {
	
			for(int i=0; i<nums.length-1; i++) {
				
				//checks if any number in the array and the number after both have a value of 5
				if(nums[i] == 5 && nums[i+1] == 5) {
				
					//if they do, make both values into a zero
					nums[i]=0;
					nums[i+1]=0;
					
				}
			
			
			}
			
			for(int i=0; i<=nums.length-1;i++) {
				
				//prints out each number of the array
				System.out.print(nums[i]);
				System.out.print(",");
				
			}

	}
	
	
	//task six: return true if any number shows up three times in a row, and return false otherwise
	public static boolean threeTimesInARow(int[] nums) {
		
		for(int i=0; i<nums.length-1; i++) {
			
			//this checks if three numbers in a row equal to the same value
			if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
			
				//if anywhere in the array three values in a row equal to the same value, it will return true
				return true;
				
			}
		
		
		}
		//return false otherwise
		return false;
		
	}
	
	
	//task seven: pass an array of ints and an int to be searched for. Return how many times that int shows up in the array.
	public static int searchForInt(int[] nums, int x) {
		
		//making a count to check how many times a value appears in the array
		int count=0;
		for(int i=0; i<nums.length; i++) {
			
			//checks if any number in the array equals to int x, which needs to be declared ahead of time (adaptable code)
			if(nums[i]==x) {
				
				//adds to the count each time the value pops up
				count++;
				
			}
			
		}
		//prints the amount of times the value x is in the array
		return count;
	}
	
	
	//task eight: alter an array so that is the backwards version of the array initially passed
	public static void backwardsArray(int[] nums) {
		
		//making a new array 
		int copyArr[] = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			
			//copying the elements over to the new array
			copyArr[i] = nums[i];
			
		}
	
		//x is the variable that goes into the copyArr
		int x=0;
		for(int i=nums.length-1; i>=0; i--) {
			
			//creates the backwards array
			nums[i]=copyArr[x];
			x++;
			
		} 

		
				
		
	}
	
	
	//task nine: shift all elements in an array to the right
	public static void shiftElements(int[] nums){
		
		//making a new array
		int[] copyArr = new int[nums.length];
		//makes a temporary int to hold the value of the last element--so it doesn't get erased from the code when everything is shifted
		int temp = nums[nums.length-1];

		for(int i= copyArr.length-1; i>0; i--){
			
			//declaring each element's value to the one on the right (shifting the elements to the right)
			copyArr[i] = nums[i-1];

		}
		
		//making the first element the temporary int (last value in previous array)
		copyArr[0] = temp;
		
		//printing out array
		for(int num : copyArr) {
			
			System.out.print(num + " ");
			
		}


	}
	
	//task ten: use either selection sort or insertion sort to sort an array
	public static void sortArray(int[] nums) {
		
		for(int i=1; i<nums.length; i++) {
			//making the int, insertion, that equals to the value of the element it's on
			int insertion = nums[i];
			//m is used to equal the element before insertion
			int m = i-1;
		
			//m needs to be greater than or equal to AND greater than the insertion number to sort it out
			while(m>=0 && nums[m]> insertion) {
			
				//if the number is smaller than the one in front, the m-- will move it in the correct spot (in front of the bigger value)
				nums[m+1] = nums[m];
				m--;
			
			}
		
			nums[m+1] = insertion;
		
			//prints out array
			for(int num : nums) {
				
				System.out.print(num + "," + " ");
				
			}

		}
		
	
	}
}
