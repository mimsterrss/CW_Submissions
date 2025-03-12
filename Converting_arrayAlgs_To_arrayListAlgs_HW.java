	//TASK 1: create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 
	//and -1 if that array has no 4's.
	public static int checkFor4(ArrayList<Integer> nums) {
		
		//goes through each element within the array
		for(int i=0; i<nums.size(); i++) {
			
			//checks that if anywhere in the array a four appears
			if(nums.get(i) == 4) {

				//returns the index of the first four in the array
				return i;
				
			}

		}
		//if there is no four in the array, it will return a -1
		return -1; 
		
	}
	
	
	//TASK 2:  Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. 
	//The ArrayList will have any 5’s deleted from nums.
	public static void ridAllFives(ArrayList<Integer> nums) {
		
		//goes through each element within the array
		for(int i=0; i<nums.size(); i++) {
			
			//checks if the array contains a five
			if(nums.get(i) == 5) {
				
				//removes the five from the array
				nums.remove(i);
				
			}
			
		}
		
	}
	
	
	
	//TASK 3: Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
	public static void bubbleSort(ArrayList<Integer> nums) {
		
		//int counter has to be higher than 0 in order for the while loop to work
		//method is used to sort the array numerically 
		int counter = 0;
		while(counter != 0)
		{

			//goes through each element within the array
			for(int i = 0; i < nums.size()-1; i++) {
				
				//if statement to swap to numbers in numerical order
				if(nums.get(i) > nums.get(i+1))
				{	
					
					//using an int called temp to hold the value of one of nums before being swapped
					int temp = nums.get(i);
					nums.set((i), nums.get(i+1));
					nums.set((1), temp);
					counter++;
				}
			}
			
	
		}
		
	}
	
}
