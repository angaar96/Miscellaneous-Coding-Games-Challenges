const isValidParentheses = (s) => {
  const splitStringArr = s.split("");
  // const onlyBracketsArr = splitStringArr.filter(character => character.match("[()\\[\\]{}]"));
  const onlyBracketsArr = splitStringArr; 
  const bracketsHashMap = {"{": "}", "[":"]", "(": ")"};
  const reversedBracketsHashMap = {"}": "{", "]": "[", ")": "("};
  if (onlyBracketsArr.length % 2 != 0) {
    return false; 
  }
  let closingBracketsStack = [];
  for (let i=0; i<onlyBracketsArr.length; i++) {
    if (Object.keys(bracketsHashMap).includes(onlyBracketsArr[i])) {
      closingBracketsStack.push(onlyBracketsArr[i]);
    } else if (closingBracketsStack.length > 0 && closingBracketsStack[closingBracketsStack.length-1] == reversedBracketsHashMap[onlyBracketsArr[i]]) {
      closingBracketsStack.pop(); 
    } else {
      return false; 
    }
  }
    
  return closingBracketsStack.length == 0; 
};

console.log(isValidParentheses("{}[}{]"));
