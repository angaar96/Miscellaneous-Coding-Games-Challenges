const longestCommonPrefix = (strs) => {
  if (strs.length === 0) {
    return ""; 
  }
  // Sort the array first so that the common prefix is initalised as a word that has a length larger than or equal to next words length. We are also limited by our shortest word anyway so its a good place to start. 
  let sortedStrs = strs.sort((a,b) => {return a.length-b.length}); 
  // note this has sorted array in place. original array (strs) is lost unless you use spread. we dont care about original strs though.  
  console.log(sortedStrs); 
  // initalise first word as common prefix and check against it. If at any point there is no match, slice the array. 
  let commonPrefix = sortedStrs[0];  
  // loop through array of strings
  for (let i=1; i<sortedStrs.length; i++) {
    // loop through a string
    for (let j=0; j<commonPrefix.length; j++) {
      if (sortedStrs[i][j] != commonPrefix[j]) {
        commonPrefix = commonPrefix.substring(0,j); 
        // we have to break here - otherwise we'll index for a value of j that doesnt exist in common prefix anymore since its been sliced. Breaking the inner j loop will move onto the next iteration of the i loop - checking the next word.  
        break
      }
    }
    
  }
  console.log(commonPrefix); 
  return commonPrefix;
}

longestCommonPrefix(["ab","a"])