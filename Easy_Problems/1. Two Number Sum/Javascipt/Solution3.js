// O(nlog(n)) | O(1) space
// Pointer Approach (Sort + Two Pointers)

function twoNumberSum(array, targetSum) {
    array.sort((a, b) => a - b);
    let left = 0;
    let right = array.length - 1;
    while (left < right) {
        const currentSum = array[left] + array[right];
        if (currentSum === targetSum) {
            return [array[left], array[right]];
        } else if (currentSum < targetSum) {
            left++;
        } else if (currentSum > targetSum) {
            right--;
        }
    }
    return [];
}

twoNumberSumTest = () => {
    console.log(twoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10)); // [-1, 11]
    console.log(twoNumberSum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 15)); // [10, 5]
    console.log(twoNumberSum([1, 3, 5, 7, 9], 8)); // [3, 5]
    console.log(twoNumberSum([1, 2, 4, 6, 8, 10, 12, 14, 16, 18], 17)); // [1, 16]
    console.log(twoNumberSum([3, 5, 7, 9], -8)); // []
    console.log(twoNumberSum([3, 5, 7, 9], 0)); // []
    console.log(twoNumberSum([3, 5, 7, 9], 1)); // []
    console.log(twoNumberSum([3, 5, 7, 9], 2)); // []
};
