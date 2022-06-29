// O(n) time | O(1) space
// Pointers with While Loop

function isValidSubsequence(array, sequence) {
    let arrIdx = 0;
    let seqIdx = 0;
    while (arrIdx < array.length && seqIdx < sequence.length) {
    if (array[arrIdx] === sequence[seqIdx]) seqIdx++;
    arrIdx++;
    }
    return seqIdx === sequence.length;
}
   

twoNumberSumTest = () => {
    print(isValidSubsequence([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10])) // true
    print(isValidSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4])) // true
    print(isValidSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4, 6])) // true
    print(isValidSubsequence([1, 2, 3, 4, 5, 6], [2, 3, 4, 6, 7])) // false
    print(isValidSubsequence([1, 2, 3, 4, 5, 6], [2, 4, 3 ])) // false
    print(isValidSubsequence([1, 2, 3, 4, 5, 6], [1])) // true
}