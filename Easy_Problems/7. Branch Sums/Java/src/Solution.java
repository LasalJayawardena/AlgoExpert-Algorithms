import java.util.ArrayList;
import java.util.List;

public class Solution {
    // O(n) time | O(n) space - where n is the number of nodes in the Bi
    public static List<Integer> getBranchSums(BST tree) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(tree.root, 0, sums);
        return sums;
    }

    public static void calculateBranchSums(Node node, int runningSum, List<Integer> sums) {
        if (node == null) return;
        int newRunningSum = runningSum + node.value;

        if ((node.left == null) && (node.right == null)) {
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.build(new int[]{1, 3, -1, 7, 2});

        System.out.println(getBranchSums(bst)); // [0, 6, 11]
    }
}
