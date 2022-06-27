# O(n) time | O(n) space

def twoNumberSum(array, targetSum):
    nums = {}
    
    for num in array:
        potentialMatch = targetSum - num
        if potentialMatch in nums:
            return [potentialMatch, num]
        else:
            nums[num] = True
    return []


# Simple Tests to see if the function works
print(twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)) # [-1, 11]
print(twoNumberSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 15)) # [3, 7]
print(twoNumberSum([1, 3, 5, 7, 9], 8)) # [1, 5]
print(twoNumberSum([1, 2, 4, 6, 8, 10, 12, 14, 16, 18], 17)) # [4, 6]
print(twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)) # [-1, 11]
print(twoNumberSum([3, 5, 7, 9], 8)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], -8)) # []
print(twoNumberSum([3, 5, 7, 9], 0)) # []
print(twoNumberSum([3, 5, 7, 9], 1)) # []
print(twoNumberSum([3, 5, 7, 9], 2)) # []
print(twoNumberSum([3, 5, 7, 9], 3)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 4)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 5)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 6)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 7)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 8)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 9)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 10)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 11)) # [3, 5]
print(twoNumberSum([3, 5, 7, 9], 12)) # [3, 5]
