// Average: O(log(n)) time | O(1) space
// Worst: O(n) time | O(1) space
// Iterative Approach

function findClosestValueInBst(tree, target) {
    return findClosestValueInBstHelper(tree.root, target, Infinity);
}

function findClosestValueInBstHelper(tree, target, closest) {
    let currentNode = tree;
    while (currentNode !== null) {
        if (Math.abs(target - closest) > Math.abs(target - currentNode.val)) {
            closest = currentNode.value;
        }
        if (target < currentNode.value) {
            currentNode = currentNode.left;
        } else if (target > currentNode.value) {
            currentNode = currentNode.right;
        } else {
            break;
        }
    }
    return closest;
}