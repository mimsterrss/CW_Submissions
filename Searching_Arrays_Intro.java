//question one
//Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 

public static int checkfor4(int[] arr, int m)
{
	int[] copyArr = arr;
	boolean isFound = false;
	for(int i = 0; I < arr.length; i++)
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

public static int checkForFour4(int[] arr)
{
  int[] copyArr = arr;
  boolean gotFour = false;
  int f = 4;
}
  






