# Average case: when the tree is balanced
# O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree

from BST import build_tree

def calculateNodeDepths(root, depth=0):
    if root is None:
        return 0
    return depth + calculateNodeDepths(root.left, depth + 1) + calculateNodeDepths(root.right, depth + 1)

# Tests for calculateNodeDepths
tree = build_tree([1, 3, -1, 7, 2])
assert(calculateNodeDepths(tree) == 6)

tree = build_tree([1, 3, -1, 7, 2, 8, 10, 11])
assert(calculateNodeDepths(tree) == 18)

tree = build_tree([4])
assert(calculateNodeDepths(tree) == 0)
