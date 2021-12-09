// remove all occurences of val 

const removeElement = (nums, val) => {
  let index = 0; 
  for (let i=0; i<nums.length; i++) {
    if (nums[i] != val) {
      nums[index] = nums[i];
      index += 1;  
    }
  }
  console.log(nums)
  console.log(index)
  return index; 
}

removeElement([3,2,2,3], 3);