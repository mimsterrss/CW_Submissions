/* Create a method subract5FromAll4() that is passed an array nums and returns a new array. The new array will consist of the values of 
*nums, except that each element must be 5 less than its corresponding element in nums. Nums will always have 4 elements. 
*/

int nums[] = {3, 6, 9, 10};

public static int[] subtract5FromAll4 (int[] arr)
{
  int[] copyArr = new int[arr.length];
  for(int i=0; i<arr.length; i++)
    {
      copyArr[i] = arr[i]-5;
    }
  return copyArr;

}


