public class Solution2 {

    // Average case: when the tree is balanced
    // O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree.
    public static int calculateNodeDepths(Node root) {
        return nodeDepthsHelper(root, 0);
    }

    public static int nodeDepthsHelper(Node root, int depth) {
        if (root == null) return 0;
        return depth + nodeDepthsHelper(root.left, depth + 1) + nodeDepthsHelper(root.right, depth + 1);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.build(new int[]{1, 3, -1, 7, 2});
        System.out.println(calculateNodeDepths(bst.root)); // 6

        bst = new BST();
        bst.build(new int[]{1, 3, -1, 7, 2, 8, 10, 11});
        System.out.println(calculateNodeDepths(bst.root)); // 18

        bst = new BST();
        bst.build(new int[]{1});
        System.out.println(calculateNodeDepths(bst.root)); // 0
    }

}
