// This is a dynamic programming problem 

const climbStairs = (n) => {
  if (n === 1) {
    return n; 
  }
  let dpArr = [];
  dpArr[0] = 1;
  dpArr[1] = 2;
  for (let i = 2; i<=n; i++) {
    dpArr[i] = dpArr[i-1] +dpArr[i-2]; 
  }
  return dpArr[n-1]; 
}

climbStairs(2); 

// Logic - take what came before 
// dp[2] = dp[1] + dp[0]
// dp[3] = dp[2] + dp[1]
// Downside - it works sequentially so takes a while for large inputs
// Time complexity = O(N)
// Space complexity = O(N) 
