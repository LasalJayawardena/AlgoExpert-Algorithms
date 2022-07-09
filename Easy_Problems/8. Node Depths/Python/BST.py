# Simple implementation of a Binary Tree
class BinaryTree:

    def __init__(self, value):

        self.left = None
        self.right = None
        self.value = value

    def insert(self, data):

        if self.value:
            if data < self.value:
                if self.left is None:
                    self.left = BinaryTree(data)
                else:
                    self.left.insert(data)
            elif data > self.value:
                if self.right is None:
                    self.right = BinaryTree(data)
                else:
                    self.right.insert(data)
        else:
            self.value = data

    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
        print( self.value),
        if self.right:
            self.right.PrintTree()


def build_tree(arr):
    root = BinaryTree(arr[0])
    for i in range(1, len(arr)):
        root.insert(arr[i])
    return root

if __name__ == "__main__":
    tree = build_tree([1, -2, 5, 40, 5,- 6, 7, 8, 9, 10])
    tree.PrintTree()