const searchInsert = (nums, target) => {
  if (nums.indexOf(target) != -1) {
    console.log(nums.indexOf(target)); 
    return nums.indexOf(target); 
  }
  // find the index where target should be 
  for (let i = 0; i<nums.length; i++) {
    if (nums[i] > target) {
      console.log(i); 
      return i; 
    }
  }
  // if it cant find where it should be, it must be at the end. 
  console.log(nums.length); 
  return nums.length; 
}

searchInsert([1,3,5,6], 7);

// i = 0, nums[i] = 1, target =2, next element
// i=1, nums[i] =3, 3 > 2, dead loop. return i-1 which is 0 