const maxSubArray = (nums) => {
  maxSub = nums[0]; 
  curSum = 0; 

  for (let i = 0; i<nums.length; i++) {
    // if its negative, reset as we know that there are positive single numbers in the set. therefore no point of counting the negative sums. 
    if (curSum < 0) {
      curSum = 0; 
    }
    curSum += nums[i];
    maxSub = Math.max(maxSub, curSum); 
  }
  return maxSub; 
}