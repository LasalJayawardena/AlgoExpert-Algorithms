// Average: O(log(n)) time | O(log(n)) space
// Worst: O(n) time | O(n) space
// Recursive Approach

import { BinarySearchTree } from "./BST";

function findClosestValueInBst(tree, target) {
    return findClosestValueInBstHelper(tree.root, target, Infinity);
}

function findClosestValueInBstHelper(tree, target, closest) {
    if (tree === null) return closest;
    if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
        closest = tree.value;
    }
    if (target < tree.value) {
        return findClosestValueInBstHelper(tree.left, target, closest);
    } else if (target > tree.value) {
        return findClosestValueInBstHelper(tree.right, target, closest);
    } else {
        return closest;
    }
}
