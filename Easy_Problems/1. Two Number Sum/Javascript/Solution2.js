// O(n) time | O(n) space
// Hashmap/Dictionary Approach

function twoNumberSum(array, targetSum) {
    const nums = {};
    for (const num of array) {
        const potentialMatch = targetSum - num;
        if (potentialMatch in nums) {
            return [potentialMatch, num];
        } else {
            nums[num] = true;
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
