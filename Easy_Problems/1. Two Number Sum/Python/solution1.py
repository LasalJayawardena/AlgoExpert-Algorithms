# O(n^2) time | O(1) space
# Brute Force Approach

def twoNumberSum(array, targetSum):
    
    for i in range(len(array) - 1):
        firstNum = array[i]
        for j in range(i + 1, len(array)):
            secondNum = array[j]
            if firstNum + secondNum == targetSum:
                return [firstNum, secondNum]
    return []


# Simple Tests to see if the function works
print(twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)) # [-1, 11]
print(twoNumberSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 15)) # [10, 5]
print(twoNumberSum([1, 3, 5, 7, 9], 8)) # [3, 5]
print(twoNumberSum([1, 2, 4, 6, 8, 10, 12, 14, 16, 18], 17)) # [1, 16]
print(twoNumberSum([3, 5, 7, 9], -8)) # []
print(twoNumberSum([3, 5, 7, 9], 0)) # []
print(twoNumberSum([3, 5, 7, 9], 1)) # []
print(twoNumberSum([3, 5, 7, 9], 2)) # []
