// O(nlog(n)) time | O(n) space
//  Brute Force Approach

function sortSquareArray(array) {
    arr_l = array.length
    sorted_arr = Array(arr_l)

    for (let i = 0; i < arr_l; i++) {
        sorted_arr[i] = Math.pow(array[i], 2)
    }

    sorted_arr.sort((a, b) => a - b)
    
    return sorted_arr;
}

sortSquareArrayTest = () => {
    console.log(sortSquareArray([-4, -1, 0, 3, 10])) // [0, 1, 9, 16, 100]
    console.log(sortSquareArray([-7, -3, 2, 3, 11])) // [4, 9, 9, 49, 121]
    console.log(sortSquareArray([-2, -1, 0, 2, 10])) // [0, 1, 4, 4, 100]
    console.log(sortSquareArray([0, 1, 4, 6, 7, 9])) // [0, 1, 16, 36, 49, 81]
}