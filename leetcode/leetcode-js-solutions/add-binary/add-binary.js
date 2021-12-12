// rules of binary 
// 1+1 = 10
// 1+0 = 1
// 0+0 = 0 
// 1+1+1 = 11
// work from right to left 
// if 10 then carry the one to next number. 
// see https://www.khanacademy.org/math/algebra-home/alg-intro-to-algebra/algebra-alternate-number-bases/v/binary-addition

const addBinary = (a,b) => {
  let answerArr = []; 
  let carry = 0;
  if (a.length != b.length) {
    let longestString = a.length > b.length ? a : b;
    if (longestString == a) { 
      b = "0".repeat(a.length-b.length) + b;
    } else {
      a = "0".repeat(b.length-a.length) + a; 
    }
  }
  console.log(a); 
  console.log(b); 
  for (let i = a.length-1; i>=0; i--) {
    switch(parseInt(a[i]) + parseInt(b[i])) {
      case 2:
        if (carry == 1) {
          answerArr.unshift("1");
          carry = 1; 
        } else {
          carry = 1; 
          answerArr.unshift("0"); 
        }
        break; 
      case 0:
        if (carry == 1) {
          answerArr.unshift("1"); 
          carry = 0; 
        } else {
          answerArr.unshift("0");
        }
        break;
      case 1:
        if (carry == 1) {
          answerArr.unshift("0");
          // carry remains 1 
        } else {
          answerArr.unshift("1");
        }
        break;  
    }
    if (i == 0 && carry == 1) {
      answerArr.unshift("1"); 
    }
  }
  console.log(answerArr.join(""))
  return answerArr.join(""); 
}

addBinary("1", "111"); 