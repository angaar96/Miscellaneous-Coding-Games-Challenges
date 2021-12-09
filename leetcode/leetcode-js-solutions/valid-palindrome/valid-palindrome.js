const isPalindrome = (s) => {
  const splitArr = s.split("");
  const filteredArr = splitArr.filter(character => character.match(/[A-Za-z0-9]/));
  const joinedString = filteredArr.join("");
  let reversedString = "";
  for (let i =filteredArr.length-1; i>=0; i--) {
      reversedString += filteredArr[i];
  }
  console.log(reversedString);
  console.log(joinedString)
  return reversedString.toLowerCase() === joinedString.toLowerCase() ? true : false; 
};

console.log(isPalindrome("A man, a plan, a canal: Panama"));