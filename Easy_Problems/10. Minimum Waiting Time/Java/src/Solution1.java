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
}
