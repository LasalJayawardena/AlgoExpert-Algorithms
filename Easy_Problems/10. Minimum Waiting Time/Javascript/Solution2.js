// Greedy Approach + Improved Logic
// Intuition is that all remaining queries are waiting for the current query to finish, therefore need to add n times where n is the number of queries remaining
// Time Complexity: O(N · log(N)), where N is the number of queries
// Space Complexity: O(1)


function getTotalMinWaitingTime(queries) {
    queries.sort((a, b) => a - b);
  
    let totalWaitingTime = 0;
  
    for (let i = 0; i < queries.length; i++) {
      const duration = queries[i];
      const queriesLeft = queries.length - (i + 1);
      totalWaitingTime += duration * queriesLeft;
    }
  
    return totalWaitingTime;
}


// Tests for getTotalMinWaitingTime
const testGetTotalMinWaitingTime = () => {
    console.log(getTotalMinWaitingTime([3, 2, 1, 2, 6]) == 17)
    console.log(getTotalMinWaitingTime([10]) == 0)
    console.log(getTotalMinWaitingTime([1, 10]) == 1)
}