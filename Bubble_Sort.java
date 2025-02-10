public static int bubbleSort(int[] nums)
	{
		//int counter has to be higher than 0 in order for the while loop to work
		//method is used to sort the array numerically
		int counter = 3;
		while(counter != 0)
		{
			counter = 0;
			//goes through each element within the array
			for(int i = 0; i < nums.length-1; i++)
			{
				//if statement to swap to numbers in numerical order
				if(nums[0] > nums[1])
				{	
					//using an int called temp to hold the value of one of nums before being swapped
					int temp = nums[0];
					nums[0] = nums[1];
					nums[1] = temp;
					counter++;
				}
			}
	
		}
	
	}
}
