# O(n) time | O(1) space
# Pointers with For Loop

def validateSubsequence2(array, sequence):
    
    seqIdx = 0
    for value in array:
        if seqIdx == len(sequence):
            break
        if sequence[seqIdx] == value:
            seqIdx += 1
    return seqIdx == len(sequence)



# Tests for validateSubsequence
print(validateSubsequence2([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10])) # True
print(validateSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4])) # True
print(validateSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4, 6])) # True
print(validateSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4, 6, 7])) # False
print(validateSubsequence2([1, 2, 3, 4, 5, 6], [2, 4, 3 ])) # False
print(validateSubsequence2([1, 2, 3, 4, 5, 6], [1])) # True