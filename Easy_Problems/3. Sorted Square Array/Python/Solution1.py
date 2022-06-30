# O(nlog(n)) time | O(n) space
# Brute Force Approach

def sortSquareArray(array):
    
    sorted_arr = [x**2 for x in array]
    sorted_arr.sort()
    return sorted_arr


# Tests for sortSqaureArray
assert(sortSquareArray([-4, -1, 0, 3, 10]) == [0, 1, 9, 16, 100])
assert(sortSquareArray([-7, -3, 2, 3, 11]) == [4, 9, 9, 49, 121])
assert(sortSquareArray([-2, -1, 0, 2, 10]) == [0, 1, 4, 4, 100])
assert(sortSquareArray([0, 1, 4, 6, 7, 9]) == [0, 1, 16, 36, 49, 81])