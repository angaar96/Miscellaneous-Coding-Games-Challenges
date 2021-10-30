// First thing is that we should be using && to group the top two statements together - no need to chain if statements. 
// Arrow functions should be used as we should be adopting ES6 standards (introduced way back in 2015 so no excuse)
// Need to use === instead of == for strict equality to avoid bugs. 
// Indentation - While it doesn't affect functionality, it severely impacts readability. 
// Too many gaps in between the lines - You can't understand what the function does if you can't view the whole thing on your screen. 
// Nesting of if statements makes the code much less readable - we need to stick to DRY principles. 
// SortandSplitString function removes two unneccessary lines and stops us from violating the SRP. 
// Innermost if statement changed to a forEach to check all letters and if statement is replaced with .includes which checks the whole array for "false".  
// Let's use let/const instead of var. We are not in the stone age anymore. 

const sortAndSplitString = (string) => {
  return string.split("").sort()
}

const checkIfStringsAreSimilar = (string1, string2) => { 

    if (typeof string1 === "string" && typeof string2 === "string") {
      const charArray1 = sortAndSplitString(string1);
      const charArray2 = sortAndSplitString(string2);
      const comparisonArray = charArray1.map((char, i) => char === charArray2[i]);
      return !comparisonArray.includes(false);
    } else {
      return "Invalid Input";
    }
} 


console.log(checkIfStringsAreSimilar('bobo', 'obob'), 'true'); 

console.log(checkIfStringsAreSimilar('bobo', 'boo4b'), 'false'); 

console.log(checkIfStringsAreSimilar('dog', 'god'), 'true'); 

// This test case fails 

console.log(checkIfStringsAreSimilar('gabety', 'gabmen'), 'false');