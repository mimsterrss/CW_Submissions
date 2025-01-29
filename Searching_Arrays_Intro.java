//question one
//Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 

public static boolean checkfor4(int[] arr, int m)
{
	int[] copyArr = arr;
	boolean isFound = false;
	for(int i = 0; i < arr.length; i++)
	{
		if(m == copyArr[i])
		{
			isFound = true;
		}
	}
	return isFound;
}



//question two
//Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 

public static int countElems(int[] arr)
{
    int[] copyArr = arr; 
    int count = 0;
    int a = 4;
    for(int i = 0; i < arr.length; i++)
    {
    	if(a == copyArr[i])
    	{
      	count++;
   	}
     }
     return count;
}



//question three
//Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 

public static boolean checkForFour4(int[] arr, int a)
{
	int [] copyArr = arr;
	int count = 0;
	boolean four4 = false;
	for (int i = 0; i < arr.length; i++)
	{
		if (count == 4)
		{
			four4 = true;
		}
		if (a == copyArr[i])
		{
			count++;
		}
	}
	return four4;
}
  






