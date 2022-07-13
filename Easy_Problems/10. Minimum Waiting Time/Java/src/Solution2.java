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
}
