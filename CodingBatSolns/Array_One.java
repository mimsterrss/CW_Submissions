//firstLast6
public boolean firstLast6(int[] nums) {
  
  if(nums[0]==6 || nums[nums.length-1]==6){
    return true;
  }
  else{
    return false;
  }
  
}

//sameFirstLast!!!!
public boolean sameFirstLast(int[] nums) {
  
  if(nums[nums.length-1]>nums.length && nums[0]==nums[nums.length-1]){
    return true;
  }
  else{
    return false;
  }
  
}
