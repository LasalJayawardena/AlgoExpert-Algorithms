# Problem 4 - Tournament Winner
--------------------

## Problem Definition

<p>There is an algorithms tournament in which multiple teams compete against each other. In each round there will be two teams that compete. There will be one winner and one loser out of all of these competitions and there are no draws. Each team will compete against all other teams exactly once. In each round the winner gets 3 points and the loser gets 0 points. 

Given two inputs, the competitions array and the results array, return the winner of the tournament(team with most number of points). </p>
<b>Aim: Solve with Minimum Time Complexity and Space Complexity.</b>

## Important Considerations

- A Tournament will have at least two teams.
- There will be only one winner.
- Inside the results array, 1 means that the home team won and 0 means the away team won.

## Example
```python
# Competition and Results arrays

competitions = [["HTML", "C#"],
                ["C#", "Python"],
                ["Python", "HTML"]]
results = [0,0,1]

# Function must return "Python"
```

## Solutions

1. Python Implementations: [Solution](Python/)
2. Java Implementations: [Solution](Java/)
2. JavaScript Implementations: [Solution](Javascript/)
