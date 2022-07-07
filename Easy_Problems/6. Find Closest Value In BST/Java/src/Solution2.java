public class Solution2 {

    // Average: O(log(n)) time | O(1) space
    // Worst: O(n) time | O(1) space
    // Iterative solution
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, Double.MAX_VALUE);
    }
    public static int findClosestValueInBst(BST tree, int target, int closest) {
        Node current = tree.root;
        while (current != null) {
            if (Math.abs(target - closest) > Math.abs(target - current.value)) {
                closest = current.value;
            }
            if (target < current.value) {
                current = current.left;
            } else if (target > current.value) {
                current = current.right;
            } else {
                return closest;
            }
        }
        return closest;
    }
}
