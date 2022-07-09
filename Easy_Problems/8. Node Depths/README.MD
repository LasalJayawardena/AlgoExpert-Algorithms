# Problem 8 - Node Depths
--------------------

## Problem Definition

<p>Given a Binary Search Tree(BST), calculate the depth of *each* node and return return the sum of all nodes' depths.</p>
<p>Depth - Distance from root.</p>
<b>Aim: Solve with Minimum Time Complexity and Space Complexity.</b>

## Important Considerations

- The BST passed is valid.
- The Depth of root node is 0.
- There can be negative integers.


## Example
```python
# BST

bst = BST([....])
# Visulization of the BST
-------------------------
#           1
#         /   \
#        2     3
#      /   \
#    4      5


# Function must return 6
# Intuition:
#                     1 --- depth: 0
#                   /   \
#     depth: 1 --- 2     3 --- depth: 1
#                /   \
#  depth: 2 --- 4     5 --- depth: 2
# Sum all the Depths 
```

## Solutions

1. Python Implementations: [Solution](Python/)
2. Java Implementations: [Solution](Java/)
2. JavaScript Implementations: [Solution](Javascript/)
