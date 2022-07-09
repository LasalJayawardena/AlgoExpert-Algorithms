// Average case: when the tree is balanced
// O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree.

function calculateNodeDepths(root, depth = 0) {
    if (root === null) return 0;
    return depth + nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1);
}
   