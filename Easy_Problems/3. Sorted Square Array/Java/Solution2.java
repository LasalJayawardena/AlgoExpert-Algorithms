import java.util.Arrays;
import java.lang.Math;

class Solution2{

    // O(n) time | O(n) space
    // Pointer Approach
    private static int[] sortSquareArray(int[] array) {
        int arr_l = array.length;
        int[] sorted_arr = new int[arr_l];

        int start = 0;
        int end = arr_l - 1;
        int idx = end;
    
        while(start <= end){
            if(Math.pow(array[start], 2) > Math.pow(array[end], 2)){
                sorted_arr[idx] = (int) Math.pow(array[start], 2);
                start++;
            } else {
                sorted_arr[idx] = (int) Math.pow(array[end], 2);
                end--;
            }
            idx--;
        }
    
        return sorted_arr;
    }
    
}