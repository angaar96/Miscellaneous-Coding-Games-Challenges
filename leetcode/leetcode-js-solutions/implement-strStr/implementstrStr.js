// This is kind of cheating because you're using indexOf. 

const strStr = (haystack, needle) => {
  if (needle == "") {
    return 0; 
  }
  if (haystack.indexOf(needle) != -1) {
    return haystack.indexOf(needle); 
  } else {
    return -1; 
  }
} 


strStr("hello", "ll");
