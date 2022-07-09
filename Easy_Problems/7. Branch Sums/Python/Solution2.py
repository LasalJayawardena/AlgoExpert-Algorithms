# O(n) time | O(log(n)) space - where n is the number of nodes in the Binary Tree 
# Worst: O(n) time | O(n) space - where n is the number of nodes in the Binary Tree 

from BST import build_tree

def getBranchSums(root):
    sums = [];
    sumOfDepths = 0
    stack = [{"node": root, "runningSum": 0}]
    
    while len(stack) > 0:
        nodeInfo = stack.pop()
        node, runningSum = nodeInfo["node"], nodeInfo["runningSum"]

        if node is None:
            continue

        newRunningSum = runningSum + node.value;

        if ((node.left == None) and (node.right == None)):
            sums.append(newRunningSum);
            continue;
        
        stack.append({"node": node.left, "runningSum": newRunningSum })
        stack.append({"node": node.right, "runningSum": newRunningSum})

    return sums
