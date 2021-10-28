const lengthOfLastWord = (s) => {
  // clean whitespace from either end 
    const cleanedArr = s.trim()
    const splitArr = cleanedArr.split(" ");
    const lastWord = splitArr[splitArr.length-1];
    return lastWord.length; 
};