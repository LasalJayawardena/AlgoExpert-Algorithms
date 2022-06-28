import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Solution2{

    // # O(n) time | O(n) space
    private static int[] findTwoSum_2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[] { diff, nums[i] };
            } else {
                numMap.put(nums[i], i);
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

        int[] pair_arr = findTwoSum_2(nums, target);

        if (pair_arr.length == 2) {
            System.out.println(pair_arr[0] + " " + pair_arr[1]);
        } else {
            System.out.println("No pair found!");
        }
    }
}