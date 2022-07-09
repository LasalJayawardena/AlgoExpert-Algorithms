// O(n) time | O(log(n)) space - where n is the number of nodes in the Binary Tree 
// Worst: O(n) time | O(n) space - where n is the number of nodes in the Binary Tree 

function calculateBranchSums(root) {
    const sums = [];
    const stack = [{ node: root, runningSum: 0 }];
  
    while (stack.length > 0) {
      const { node, runningSum } = stack.pop();
  
      const newRunningSum = runningSum + node.value;
  
      if (!node.left && !node.right) {
        sums.push(newRunningSum);
        continue;
      }
  
      if (node.right) {
        stack.push({ node: node.right, runningSum: newRunningSum });
      }
  
      if (node.left) {
        stack.push({ node: node.left, runningSum: newRunningSum });
      }
    }
  
    return sums;
  }