# Average case: when the tree is balanced
# O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree

from BST import build_tree

def calculateNodeDepths(root):
    sumOfDepths = 0
    stack = [{"node": root, "depth": 0}]
    while len(stack) > 0:
        nodeInfo = stack.pop()
        node, depth = nodeInfo["node"], nodeInfo["depth"]
        if node is None:
            continue
        sumOfDepths += depth
        stack.append({"node": node.left, "depth": depth + 1})
        stack.append({"node": node.right, "depth": depth + 1})
    return sumOfDepths


# Tests for calculateNodeDepths
tree = build_tree([1, 3, -1, 7, 2])
assert(calculateNodeDepths(tree) == 6)

tree = build_tree([1, 3, -1, 7, 2, 8, 10, 11])
assert(calculateNodeDepths(tree) == 18)

tree = build_tree([4])
assert(calculateNodeDepths(tree) == 0)
