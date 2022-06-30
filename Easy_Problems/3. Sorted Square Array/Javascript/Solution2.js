// O(n) time | O(n) space
// Pointer Approach

function sortSquareArray(array) {
    arr_l = array.length
    sorted_arr = Array(arr_l)

    start = 0
    end = arr_l - 1
    idx = end

    while(start <= end){
        if(Math.pow(array[start], 2) > Math.pow(array[end], 2)){
            sorted_arr[idx] = Math.pow(array[start], 2)
            start++
        } else {
            sorted_arr[idx] = Math.pow(array[end], 2)
            end--
        }
        idx--
    }

    return sorted_arr
}

sortSquareArrayTest = () => {
    console.log(sortSquareArray([-4, -1, 0, 3, 10])) // [0, 1, 9, 16, 100]
    console.log(sortSquareArray([-7, -3, 2, 3, 11])) // [4, 9, 9, 49, 121]
    console.log(sortSquareArray([-2, -1, 0, 2, 10])) // [0, 1, 4, 4, 100]
    console.log(sortSquareArray([0, 1, 4, 6, 7, 9])) // [0, 1, 16, 36, 49, 81]
}