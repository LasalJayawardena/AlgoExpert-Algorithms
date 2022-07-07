public class BST {
    //node class that defines BST node
    class Node {
        int value;
        Node left, right;

        public Node(int data){
            value = data;
            left = right = null;
        }
    }
    // BST root node
    public Node root;

   // Constructor for BST =>initial empty tree
    BST(){
        root = null;
    }
    //delete a node from BST
    void deleteKey(int value) {
        root = delete_Recursive(root, value);
    }

    //recursive delete function
    Node delete_Recursive(Node root, int value)  {
        //tree is empty
        if (root == null)  return root;

        //traverse the tree
        if (value < root.value)     //traverse left subtree
            root.left = delete_Recursive(root.left, value);
        else if (value > root.value)  //traverse right subtree
            root.right = delete_Recursive(root.right, value);
        else  {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.value);
        }
        return root;
    }

    int minValue(Node root)  {
        //initially minval = root
        int minval = root.value;
        //find minval
        while (root.left != null)  {
            minval = root.left.value;
            root = root.left;
        }
        return minval;
    }

    // insert a node in BST
    void insert(int value)  {
        root = insert_Recursive(root, value);
    }

    //recursive insert function
    Node insert_Recursive(Node root, int value) {
          //tree is empty
        if (root == null) {
            root = new Node(value);
            return root;
        }
        //traverse the tree
        if (value < root.value)     //insert in the left subtree
            root.left = insert_Recursive(root.left, value);
        else if (value > root.value)    //insert in the right subtree
            root.right = insert_Recursive(root.right, value);
          // return pointer
        return root;
    }

// method for inorder traversal of BST
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.value + " ");
            inorder_Recursive(root.right);
        }
    }

    boolean search(int value)  {
        root = search_Recursive(root, value);
        if (root!= null)
            return true;
        else
            return false;
    }

    //recursive insert function
    Node search_Recursive(Node root, int value)  {
        // Base Cases: root is null or value is present at root
        if (root==null || root.value==value)
            return root;
        // val is greater than root's value
        if (root.value > value)
            return search_Recursive(root.left, value);
        // val is less than root's value
        return search_Recursive(root.right, value);
    }
}
class Main{
    public static void main(String[] args)  {
       //create a BST object
        BST bst = new BST();
        /* BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50   */
        //insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        //delete leaf node
        System.out.println("\nThe BST after Delete 12(leaf node):");
        bst.deleteKey(12);
        bst.inorder();
        //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        //delete node with two children
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        //search a value in the BST
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("\nKey 12 found in BST:" + ret_val );
     }
}
