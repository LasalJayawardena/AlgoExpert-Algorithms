public class Solution2 {

    // Average case: when the tree is balanced
    // O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree.
    public static int nodeDepths(Node root) {
        return nodeDepthsHelper(root, 0);
    }

    public static int nodeDepthsHelper(Node root, int depth) {
        if (root == null) return 0;
        return depth + nodeDepthsHelper(root.left, depth + 1) + nodeDepthsHelper(root.right, depth + 1);
    }

}
