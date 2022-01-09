const sqrtx = (x) => {
  // loop through all possible integers
  let upperBound = 0;  
  while (upperBound*upperBound < x) {
    upperBound += 1; 
  }
  console.log(upperBound);
  if (upperBound*upperBound == x) {
    console.log(upperBound);
    return upperBound;
  } else {
    return upperBound - 1; 
}

sqrtx(807810077);