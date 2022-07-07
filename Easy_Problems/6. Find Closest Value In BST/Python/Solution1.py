# Average: O(log(n)) time | O(log(n)) space
# Worst: O(n) time | O(n) space
# Recursive Approach

from BST import build_tree

def findClosestValueInBst(tree, target):
    return findClosestValueInBstHelper(tree, target, float("inf"))

def findClosestValueInBstHelper(tree, target, closest):
    if tree is None:
        return closest
    if abs(target - closest) > abs(target - tree.value):
        closest = tree.value
    if target < tree.value:
        return findClosestValueInBstHelper(tree.left, target, closest)
    elif target > tree.value:
        return findClosestValueInBstHelper(tree.right, target, closest)
    else:
        return closest

# Tests for findClosestValueInBst
tree = build_tree([10, 4, 1, 6, 20])
assert(findClosestValueInBst(tree, -1) == 1)
assert(findClosestValueInBst(tree, 4) == 4)

tree = build_tree([1, -2, 5, 40, 5,- 6, 7, 8, 9, 10])
assert(findClosestValueInBst(tree, 25) == 40)
assert(findClosestValueInBst(tree, -3) == -2)

