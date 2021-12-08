const longestCommonPrefix = (strs) => {
  if (strs.length === 0) {
    return ""; 
  }
  // initalise first word as common prefix and check against it. 
  let commonPrefix = strs[0];  
  // loop through array of strings
  for (let i=1; i<strs.length; i++) {
    // use while loop to shorten common prefix by 1 element while there is no common prefix in the string. Note indexOf used on a string will find a substring!  
    while (strs[i].indexOf(commonPrefix) !== 0) {
      commonPrefix = commonPrefix.substring(0, commonPrefix.length-1); 
    }
    
  }
  console.log(commonPrefix); 
  return commonPrefix;
}

longestCommonPrefix(["ab","a"])
// commonPrefix = ab
// if a is not equal to a then do a substring. 
// then end loop 