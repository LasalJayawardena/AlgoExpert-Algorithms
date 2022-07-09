import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    // Average case: when the tree is balanced
    // O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree.
    public static int calculateNodeDepths(Node root) {
        int sumOfDepths = 0;
        List<Level> stack = new ArrayList<>();
        stack.add(new Level(root, 0));
        while (stack.size() > 0) {
            Level top = stack.remove(stack.size() - 1);
            Node node = top.root;
            int depth = top.depth;
            if (node == null) continue;
            sumOfDepths += depth;
            stack.add(new Level(node.left, depth + 1));
            stack.add(new Level(node.right, depth + 1));
        }
        return sumOfDepths;
    }

    static class Level {
        public Node root;
        int depth;

        public Level(Node root, int depth) {
            this.root = root;
            this.depth = depth;
        }
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
