// O(n^2) time | O(1) space
// Brute Force Approach

function twoNumberSum(array, targetSum) {
    for (let i = 0; i < array.length - 1; i++) {
        const firstNum = array[i];
        for (let j = i + 1; j < array.length; j++) {
            const secondNum = array[j];
            if (firstNum + secondNum === targetSum) {
                return [firstNum, secondNum];
            }
        }
    }
    return [];
}

twoNumberSumTest = () => {
    console.log(twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)) // [-1, 11]
    console.log(twoNumberSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 15)) // [10, 5]
    console.log(twoNumberSum([1, 3, 5, 7, 9], 8)) // [3, 5]
    console.log(twoNumberSum([1, 2, 4, 6, 8, 10, 12, 14, 16, 18], 17)) // [1, 16]
    console.log(twoNumberSum([3, 5, 7, 9], -8)) // []
    console.log(twoNumberSum([3, 5, 7, 9], 0)) // []
    console.log(twoNumberSum([3, 5, 7, 9], 1)) // []
    console.log(twoNumberSum([3, 5, 7, 9], 2)) // []
}