//rotateLeft3
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

public int[] rotateLeft3(int[] nums) {
  
  int[] tempArr = new int[nums.length];
  tempArr[0]=nums[1];
  tempArr[1]=nums[2];
  tempArr[2]=nums[0];
  return tempArr;
  
}



//reverse3
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

public int[] reverse3(int[] nums) {
  
  int[] tempArr = new int[nums.length];
  tempArr[0]=nums[2];
  tempArr[1]=nums[1];
  tempArr[2]=nums[0];
  return tempArr;
  
}



//maxEnd3
//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
  
  int[] tempArr = new int[nums.length];
  
  if(nums[0]<nums[2]){
    tempArr[1]=nums[2];
    tempArr[0]=nums[2];
    tempArr[2]=nums[2];
  }
  else
  {
    tempArr[0]=nums[0];
    tempArr[1]=nums[0];
    tempArr[2]=nums[0];
  }
  return tempArr;
  
}



//sum2
//Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

public int sum2(int[] nums) {
  
  int[] tempArr = new int[nums.length];
  if(tempArr.length==0)
  {
    return 0;
  }
  else if(tempArr.length==1)
  {
    tempArr[0]=nums[0];
    return tempArr[0];
  }
  else
  {
    tempArr[0]=nums[0];
    tempArr[1]=nums[1];
    return tempArr[0]+tempArr[1];
  }
  
}



//middleWay
//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

