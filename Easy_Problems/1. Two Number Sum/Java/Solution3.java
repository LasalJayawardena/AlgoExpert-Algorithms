import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Solution3{

    // O(nlog(n)) | O(1) space
    // Pointer Approach (Sort + Two Pointers)
    private static int[] findTwoSum_3(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sc.close();

        int[] pair_arr = findTwoSum_3(nums, target);

        if (pair_arr.length == 2) {
            System.out.println(pair_arr[0] + " " + pair_arr[1]);
        } else {
            System.out.println("No pair found!");
        }
    }
}