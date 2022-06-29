// O(n) time | O(1) space
// Pointers with For Loop

function isValidSubsequence2(array, sequence) {
    let seqIdx = 0;
    for (const value of array) {
        if (seqIdx === sequence.length) break;
        if (sequence[seqIdx] === value) seqIdx++;
    }
    return seqIdx === sequence.length;
}
   
   

twoNumberSumTest = () => {
    print(isValidSubsequence2([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10])) // true
    print(isValidSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4])) // true
    print(isValidSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4, 6])) // true
    print(isValidSubsequence2([1, 2, 3, 4, 5, 6], [2, 3, 4, 6, 7])) // false
    print(isValidSubsequence2([1, 2, 3, 4, 5, 6], [2, 4, 3 ])) // false
    print(isValidSubsequence2([1, 2, 3, 4, 5, 6], [1])) // true
}