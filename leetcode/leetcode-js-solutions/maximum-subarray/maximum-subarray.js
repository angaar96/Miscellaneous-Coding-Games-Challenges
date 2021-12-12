// O(n^2) solution

const maxSubArray = (nums) => {
  if (nums.length == 1) {
    return nums[0]; 
  }
  let iterator = 1; 
  let sumsArr = [nums[0]]; 
  let maxSumValue = nums[0]; 
  for (let i=0; i<nums.length; i++) {
    for (let j=i+1; j<nums.length; j++) {
      sumsArr.push(sumsArr[j-iterator]+nums[j]); 
    }
    if (Math.max(...sumsArr) > maxSumValue) {
      maxSumValue = Math.max(...sumsArr); 
    }
    iterator+=1; 
    console.log(`max sum value = ${maxSumValue}`); 
    console.log(sumsArr)
    sumsArr = [nums[i+1]];
    console.log(sumsArr)
  }
  console.log(maxSumValue)
  return(maxSumValue)
}

maxSubArray([-2,1,-3,4,-1,2,1,-5,4]); 