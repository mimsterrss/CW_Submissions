//firstLast6
public boolean firstLast6(int[] nums) {
  
  if(nums[0]==6 || nums[nums.length-1]==6){
    return true;
  }
  else{
    return false;
  }
  
}



//sameFirstLast
public boolean sameFirstLast(int[] nums) {
  
  if(nums.length==0)
  {
    return false;
  }
  else if(nums[0]==nums[nums.length-1])
  {
    return true;
  }
  else
  {
    return false;
  }

}



//makePi
public int[] makePi() {
  
  int[] piArr = {3, 1, 4};
  return piArr;
  
}



//commonEnd
public boolean commonEnd(int[] a, int[] b) {
  
  if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
  {
    return true;
  }
  else
  {
    return false;
  }
  
}



//sum3
public int sum3(int[] nums) {
  
  return nums[0]+nums[1]+nums[2];

}




