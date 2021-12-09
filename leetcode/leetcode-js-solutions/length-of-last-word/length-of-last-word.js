const lengthOfLastWord = (s) => {
  // clean whitespace from either end 
    const cleanedString = s.trim()
    const splitArr = cleanedString.split(" ");
    const lastWord = splitArr[splitArr.length-1];
    return lastWord.length; 
};