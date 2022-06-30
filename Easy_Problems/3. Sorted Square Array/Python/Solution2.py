# O(n) time | O(n) space
# Pointer Approach

def sortSquareArray(array):
    
    sorted_arr = [0 for _ in array]
    start = 0
    end = len(array) - 1
    idx = end
    while start <= end:
        if abs(array[start]) >= abs(array[end]):
            sorted_arr[idx] = array[start]**2
            start += 1
        else:
            sorted_arr[idx] = array[end]**2
            end -= 1
        idx -= 1
    return sorted_arr


# Tests for sortSqaureArray
assert(sortSquareArray([-4, -1, 0, 3, 10]) == [0, 1, 9, 16, 100])
assert(sortSquareArray([-7, -3, 2, 3, 11]) == [4, 9, 9, 49, 121])
assert(sortSquareArray([-2, 0, 2, 10]) == [0, 4, 4, 100])
assert(sortSquareArray([0, 1, 4, 6, 7, 9]) == [0, 1, 16, 36, 49, 81])