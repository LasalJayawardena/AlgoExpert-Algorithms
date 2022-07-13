import java.util.Arrays;

public class Solution1 {

    public static int getTotalMinWaitingTime(int[] queries) {
        Arrays.sort(queries);

        int nextWaitingTime = 0;
        int totalWaitingTime = 0;

        for (int duration: queries) {
          totalWaitingTime += nextWaitingTime;
          nextWaitingTime += duration;
        }

        return totalWaitingTime;
    }

    public static void main(String[] args) {
        // Tests for getTotalMinWaitingTime
        int[] queries = new int[] {3, 2, 1, 2, 6};
        System.out.println(getTotalMinWaitingTime(queries)); // 17
        queries = new int[] {10};
        System.out.println(getTotalMinWaitingTime(queries)); // 0
        queries = new int[] {3, 1};
        System.out.println(getTotalMinWaitingTime(queries)); // 1
    }
}
