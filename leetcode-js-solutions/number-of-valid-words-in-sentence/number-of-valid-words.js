const numberOfValidWords = (sentence) => {
  cleanedString = sentence.trim("");
  splitStringArr = cleanedString.split(" ");
  validWordsArr = [];
  let requirements = [true, true, true, true]; 
  splitStringArr.forEach(word => {
    requirements = [true,true,true,true]
    if (word.match(/[^a-z\-!., ]/g) || word === "") {
      // console.log("not a valid word");
    } else if (word == "-") {
      console.log("Not a valid word")
    } else if (word == "!" || word == "," || word == ".") {
      validWordsArr.push(word); 
    } else if (word.match(/[!\-,.]/g)) {
      if (word.match(/[-]/g)) {
        word.match(/([a-z]\-[a-z])/g) && word.match(/[-]/g).length === 1 ? requirements[0] = true : requirements[0] = false;  
      }
      if (word.match(/[!]/g)) {
        word.match(/[a-z]!{1}$/g) && word.match(/[!]/g).length === 1 ? requirements[1] = true : requirements[1] = false;
      } 
      if (word.match(/[.]/g)) {
        word.match(/[a-z]\.{1}$/g) && word.match(/[.]/g).length === 1 ? requirements[2] = true : requirements[2] = false;
      }
      if (word.match(/[,]/g)) {
        word.match(/[a-z],{1}$/g) && word.match(/[,]/g).length === 1 ? requirements[3] = true : requirements[3] = false;
      }
      if (!requirements.includes(false)) {
        validWordsArr.push(word);
      }
    } else {
      validWordsArr.push(word); 
    }
  })
  console.log(validWordsArr.length)
  return validWordsArr.length; 
} 

numberOfValidWords("..");

