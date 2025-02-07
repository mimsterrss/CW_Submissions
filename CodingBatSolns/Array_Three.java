//has23
//Given an int array length 2, return true if it contains a 2 or a 3.

public boolean has23(int[] nums) {
  
  if(nums[0] == 2 || nums[1] == 2)
  {
    return true;
  }
  else if(nums[0] == 3 || nums[1] == 3)
  {
    return true;
  }
  return false;
  
}



//no23
//Given an int array length 2, return true if it does not contain a 2 or 3.

public boolean no23(int[] nums) {
  
  if(nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3)
  {
    return true;
  }
  return false;
  
}



//makeLast
//Given an int array, return a new array with double the length where its last element is the same as theoriginal array, and all the other elements are 0. The original array will be length 1 or more. 
//Note: by default, a new int array contains all 0's.

public int[] makeLast(int[] nums) {
    
    int[] copyArr = new int[2 * nums.length];
    copyArr[copyArr.length - 1] = nums[nums.length - 1];
    return copyArr;
    
}



//double23
//Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

public boolean double23(int[] nums) {
  
  int countTwo = 0;
  int countThree = 0;
  
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 2)
    {
      countTwo++;
    }
    
    if(nums[i] == 3)
    {
      countThree++;
    }
    
  }
  return countTwo == 2 || countThree == 2;
  
}



//fix 23
//Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

public int[] fix23(int[] nums) {
  
  for(int i = 0; i < nums.length-1; i++)
  {
    if(nums[i] == 2 && nums[i + 1] ==3)
    {
      nums[i + 1] = 0;
    }
  }
  return nums;
  
}



//start1
//Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

public int start1(int[] a, int[] b) {
  
  int count = 0;
  if(a.length > 0 && a[0] == 1)
  {
    count++;
  }
  
  if(b.length > 0 && b[0] == 1)
  {
    count++;
  }
  return count;
  
}



//biggerTwo
//Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

public int[] biggerTwo(int[] a, int[] b) {
  
  if(a[0] + a[1] < b[0] + b[1])
  {
    return b;
  }

  if(a[0] + a[1] > b[0] + b[1])
  {
    return a;
  }
  return a;
  
}



//makeMiddle
//Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

public int[] makeMiddle(int[] nums) {
  
  int middle = (nums.length/2)-1;
  int[] copyArr = new int[] {nums[middle], nums[middle + 1]};
  return copyArr;
  
}



//plusTwo
//Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

public int[] plusTwo(int[] a, int[] b) {
  
  int[] copyArr = {a[0], a[1], b[0], b[1]};
  return copyArr;
  
}



//swapEnds
//Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

public int[] swapEnds(int[] nums) {
  
    int copy = nums[0];
    
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = copy;
    
    return nums;
    
}



//midThree
//Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

public int[] midThree(int[] nums) {
  
  int middle = (nums.length/2)-1;
  int[] copyArr = new int[] {nums[middle], nums[middle + 1], nums[middle + 2]};
  return copyArr;
  
}



//maxTriple
//Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

public int maxTriple(int[] nums) {
  
  int first = (nums[0]);
  int middle = (nums[nums.length/2]);
  int last = (nums[nums.length-1]);
  
  if(first > middle && first > last){
    return first;
  }
  if(middle > first && middle > last){
    return middle;
  }
  return last;
  
}



//frontPiece
//Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

public int[] frontPiece(int[] nums) {
  
  int[] copyArr = new int[2];
  if(nums.length < 2){
    return nums;
  }
  
  for(int i = 0; i < 2; i++)
  {
    copyArr[i] = nums[i];
  }
  return copyArr;
  
}



//unlucky1
//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


