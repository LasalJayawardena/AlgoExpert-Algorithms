import java.util.ArrayList;
import java.util.List;

public class Solution {
    // O(n) time | O(n) space - where n is the number of nodes in the Bi
    public static List<Integer> branchSums(BST tree) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(tree.root, 0, sums);
        return sums;
    }

    public static void calculateBranchSums(Node node, int runningSum, List<Integer> sums) {
        if (node == null) return;
        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }
    }
}
