# Average: O(log(n)) time | O(1) space
# Worst: O(n) time | O(1) space
# Iterative approach

from BST import build_tree

def findClosestValueInBst(tree, target):
 return findClosestValueInBstHelper(tree, target, float("inf"))

def findClosestValueInBstHelper(tree, target, closest):
    currentNode = tree

    while currentNode is not None:
        if abs(target - closest) > abs(target - currentNode.value):
            closest = currentNode.value
        if target < currentNode.value:
            currentNode = currentNode.left
        elif target > currentNode.value:
            currentNode = currentNode.right
        else:
            break

    return closest

# Tests for findClosestValueInBst
tree = build_tree([10, 4, 1, 6, 20])
assert(findClosestValueInBst(tree, -1) == 1)
assert(findClosestValueInBst(tree, 4) == 4)

tree = build_tree([1, -2, 5, 40, 5,- 6, 7, 8, 9, 10])
assert(findClosestValueInBst(tree, 25) == 40)
assert(findClosestValueInBst(tree, -3) == -2)