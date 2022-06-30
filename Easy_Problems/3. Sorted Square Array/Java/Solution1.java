import java.util.Arrays;

class Solution1{

    // O(nlog(n)) time | O(n) space
    // Brute Force Approach
    private static int[] sortSquareArray(int[] array) {
        int arr_l = array.length;
        int[] sorted_arr = new int[arr_l];
        
        for (int i = 0; i < arr_l; i++) {
            sorted_arr[i] = array[i] * array[i];
        }
        Arrays.sort(sorted_arr);
        return sorted_arr;
    }
    
}