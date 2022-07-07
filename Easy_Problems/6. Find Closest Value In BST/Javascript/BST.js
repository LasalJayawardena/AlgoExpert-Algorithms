class Node
{
    constructor(data)
    {
        this.value = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor() {
        // root of a binary search tree
        this.root = null;
    }

    insert(data) {
        // Creating a node and initialising
        // with data
        var newNode = new Node(data);

        // root is null then node will
        // be added to the tree and made root.
        if (this.root === null) this.root = newNode;
        // find the correct position in the
        // tree and add the node
        else this.insertNode(this.root, newNode);
    }

    buildTree(arr) {
        for (let i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }
}

exports.BinarySearchTree = BinarySearchTree;