# Problem 9 - Depth-First Search
--------------------

## Problem Definition

<p>Given an acyclic tree-like graph. Each node in this graph is going to be an instance of a <code>Node</code> class</p>
<p>Write a <code>depthFirstSearch</code> method on the <code>Node</code> class, which is going to accept an empty array as argument and perform a depth-first search on the graph.</p>
<b>Aim: Implement the DFS algorithm.</b>

## Important Considerations

- The graph is acyclic and tree-like, it means the graph is directed and all the nodes except the root node has only one parent.
- No need to use a data structure to keep track of the nodes that have been visited
- Store the names of all the nodes in the input array and return that array.
- The nodes should be visited from left to right.



## In-Depth Complexity Analysis
Let |V| be the number of nodes(vertices) in the input graph and |E| the number of edges.

- Space Complexity: <code>O(V)</code>

- Time Complexity: <code>O(|V| + |E|)</code> when the graph is represented as an adjacency list. The total time of DFS is number of subproblems \* time per subproblem, in other words, we can get the total time of DFS by summing up all of the subproblems' time. Since we visit each vertex _v_ once, the number of subproblems is equal to the number of vertices in the graph. Therefore we can write:

total time = ∑<sub>v ∈ V</sub>_(time for subproblem)_

At each vertex _v_, we append _v_'s name to an array, loop over its adjacent vertices and invoke the recursive function on each adjacent vertex. Let _m<sub>v</sub>_ denotes the number of edges coming out of the vertex _v_. The time for subproblem is 1 + _m<sub>v</sub>_. Therefore,

total time = ∑<sub>v ∈ V</sub>_(1 + m<sub>v</sub>)_ = |V| + ∑<sub>v ∈ V</sub>_m<sub>v</sub>_

In a directed graph, ∑<sub>v ∈ V</sub>_m<sub>v</sub>_ is equal to |E|, whereas in an undirected graph, we have ∑<sub>v ∈ V</sub>_m<sub>v</sub>_ = 2|E|. Thus the time complexity of DFS is O(|V| + |E|).


<br>

**Reference**: [Verifying DFS complexity for directed and un-directed graph](https://stackoverflow.com/questions/24024331/verifying-dfs-complexity-for-directed-and-un-directed-graph)

**Additional Video Reference**:[ DFS Explained](https://www.youtube.com/watch?v=PMMc4VsIacU)

## Solutions

1. Python Implementations: [Solution](Python/)
2. Java Implementations: [Solution](Java/)
2. JavaScript Implementations: [Solution](Javascript/)
