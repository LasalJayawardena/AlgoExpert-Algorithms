public class Solution2 {

    // Average: O(log(n)) time | O(1) space
    // Worst: O(n) time | O(1) space
    // Iterative solution
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree.root, target, Integer.MAX_VALUE/2);
    }
    public static int findClosestValueInBst(Node tree, int target, int closest) {
        Node current = tree;
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

    public static void main(String[] args) {
        BST bst = new BST();
        bst.build(new int[]{10, 4, 1, 6, 20});

        System.out.println(Solution2.findClosestValueInBst(bst, -1)); //1
        System.out.println(Solution2.findClosestValueInBst(bst, 4)); // 4

        bst = new BST();
        bst.build(new int[]{1, -2, 5, 40, 5,- 6, 7, 8, 9, 10});
        System.out.println(Solution2.findClosestValueInBst(bst, 25)); // 40
        System.out.println(Solution2.findClosestValueInBst(bst, -3)); // -2
    }
}
