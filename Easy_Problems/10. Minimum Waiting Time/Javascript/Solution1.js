// Greedy Approach
// Time Complexity: O(N · log(N)), where N is the number of queries
// Space Complexity: O(1)

function getTotalMinWaitingTime(queries) {
    queries.sort((a, b) => a - b);
  
    let nextWaitingTime = 0;
    let totalWaitingTime = 0;
  
    for (const duration of queries) {
      totalWaitingTime += nextWaitingTime;
      nextWaitingTime += duration;
    }
  
    return totalWaitingTime;
}
