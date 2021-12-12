const plusOne = (digits) => {
  for (let i=digits.length-1; i>=0; i--) {
    if (digits[i] != 9) {
      digits[i] += 1; 
      return digits; 
    } else {
      digits[i] = 0; 
    }
  }
  // edge case - if all digits are 9
  digits.unshift(1); 
  return digits; 
}

plusOne([9]); 