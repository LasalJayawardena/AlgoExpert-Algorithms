# Average case: when the tree is balanced
# O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree

def calculateNodeDepths(root, depth=0):
    if root is None:
        return 0
    return depth + calculateNodeDepths(root.left, depth + 1) + calculateNodeDepths(root.right, depth + 1)