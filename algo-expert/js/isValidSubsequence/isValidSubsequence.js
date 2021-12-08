const isValidSubsequence = (array, sequence) => {
  let pointerIndex = 0; 
  for (let i=0; i<array.length; i++) {
    if (pointerIndex == sequence.length) {
      return true; 
    }
    if (array[i]==sequence[pointerIndex]) {
      pointerIndex++
    }
    console.log(pointerIndex)
  }
  return pointerIndex == sequence.length;
}

isValidSubsequence([5,1,22,25,6,-1,8,10], [25]); 


