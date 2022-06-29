# O(n) time | O(1) space
# Pointers with While Loop

def validateSubsequence(array, sequence):
    
    arrIdx = 0
    seqIdx = 0
    while arrIdx < len(array) and seqIdx < len(sequence):
        if array[arrIdx] == sequence[seqIdx]:
            seqIdx += 1
        arrIdx += 1
    return seqIdx == len(sequence)



# Tests for validateSubsequence
print(validateSubsequence([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10])) # True
print(validateSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4])) # True
print(validateSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4, 6])) # True
print(validateSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4, 6, 7])) # False
print(validateSubsequence([1, 2, 3, 4, 5, 6], [2, 4, 3 ])) # False
print(validateSubsequence([1, 2, 3, 4, 5, 6], [1])) # True