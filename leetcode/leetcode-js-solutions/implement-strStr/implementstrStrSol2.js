const strStr = (haystack, needle) => {
  if (needle == "") {
    return 0; 
  }
  for (let i = 0; i<haystack.length-needle.length+1; i++) {
    for (let j=0; j<needle.length; j++) {
      if (needle[j] != haystack[i+j]) {
        break;
      }
      // if the loop ends without breaking, then the needle exists within the haystack. 
      if (j == needle.length-1) {
        console.log(i); 
        return i; 
      }
    }
  }
  return -1; 
} 

strStr("hello", "ll"); 
