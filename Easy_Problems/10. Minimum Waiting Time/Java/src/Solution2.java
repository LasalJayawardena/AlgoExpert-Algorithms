import java.util.Arrays;

public class Solution2 {
    public static int getTotalMinWaitingTime(int[] queries) {
        Arrays.sort(queries);

        int totalWaitingTime = 0;

        for (int i = 0; i < queries.length; i++) {
          int duration = queries[i];
          int queriesLeft = queries.length - (i + 1);
          totalWaitingTime += duration * queriesLeft;
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
