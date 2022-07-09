// Average case: when the tree is balanced
// O(n) time | O(h) space - where n is the number of nodes and h is the height of the Binary Tree.


function nodeDepths(root) {
    let sumOfDepths = 0;
    const stack = [{ node: root, depth: 0 }];
    while (stack.length > 0) {
        const { node, depth } = stack.pop();
        if (node === null) continue;
        sumOfDepths += depth;
        stack.push({ node: node.left, depth: depth + 1 });
        stack.push({ node: node.right, depth: depth + 1 });
    }
    return;
}
