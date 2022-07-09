# O(n) time | O(log(n)) space - where n is the number of nodes in the Binary Tree 
# Worst: O(n) time | O(n) space - where n is the number of nodes in the Binary Tree 

from BST import build_tree

def getBranchSums(root):
    sums = []
    calculateBranchSums(root, 0, sums)
    return sums

def calculateBranchSums(node, runningSum, sums):
    if node is None:
        return

    newRunningSum = runningSum + node.value
    
    if node.left is None and node.right is None:
        sums.append(newRunningSum)
        return
    
    calculateBranchSums(node.left, newRunningSum, sums)
    calculateBranchSums(node.right, newRunningSum, sums)


# Tests for findClosestValueInBst
tree = build_tree([1, 3, -1, 7, 2])
assert(getBranchSums(tree) == [0, 6, 11])
