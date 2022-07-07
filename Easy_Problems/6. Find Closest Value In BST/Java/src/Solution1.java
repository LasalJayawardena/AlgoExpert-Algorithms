public class Solution1 {
    // Average: O(log(n)) time | O(log(n)) space
    // Worst: O(n) time | O(n) space
    // Recursive solution
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree.root, target, Double.MAX_VALUE);
    }

    public static int findClosestValueInBst(Node tree, int target, double closest){
         if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
                closest = tree.value;
            }
         if (target < tree.value && tree.left != null) {
                return findClosestValueInBst(tree.left, target, closest);
            } else if (target > tree.value && tree.right != null) {
                return findClosestValueInBst(tree.right, target, closest);
            } else {
                return (int) closest;
            }
        }

    public static void main(String[] args) {
        Solution1 bst_Sol = new Solution1();
        BST bst = new BST();
        bst.build(new int[]{10, 4, 1, 6, 20});

        System.out.println(findClosestValueInBst(bst, -1)); //1
        System.out.println(findClosestValueInBst(bst, 4)); // 4

        bst = new BST();
        bst.build(new int[]{1, -2, 5, 40, 5,- 6, 7, 8, 9, 10});
        System.out.println(findClosestValueInBst(bst, 25)); // 40
        System.out.println(findClosestValueInBst(bst, -3)); // -2
    }
}
