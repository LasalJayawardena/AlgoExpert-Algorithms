import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    // O(n) time | O(log(n)) space - where n is the number of nodes in the Binary Tree
    // Worst: O(n) time | O(n) space - where n is the number of nodes in the Binary Tree
    public static List<Integer> getBranchSums(BST tree) {
        List<Level> stack = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();
        stack.add(new Level(tree.root, 0));

        while (stack.size() > 0) {
            Level top = stack.remove(stack.size() - 1);
            Node node = top.root;
            int runningSum = top.runningSum;

            int newRunningSum = runningSum + node.value;
            if ((node.left == null) && (node.right == null)) {
                sums.add(newRunningSum);
                continue;
            }

          if(node.right != null) {
            stack.add(new Level(node.right, newRunningSum));
          }

          if (node.left != null) {
            stack.add(new Level(node.left, newRunningSum));
          }
        }
        return sums;
    }

    static class Level {
        public Node root;
        int runningSum;

        public Level(Node root, int runningSum) {
            this.root = root;
            this.runningSum = runningSum;
        }
    }
    
}
