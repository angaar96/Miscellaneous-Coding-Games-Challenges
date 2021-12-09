const removeDuplicates = (nums) => {
  let index = 0;
  // do length -1 to stop it going out of bounds
  for(let i=0; i<nums.length-1; i++) {
    if(nums[i] != nums[i+1]) {
      index++
      nums[index] = nums[i+1];  
    }
  }
  console.log(nums)
  // number of list items is index + 1 since index doesnt account for first value
    return index+1
}

removeDuplicates([1,1,2]); 