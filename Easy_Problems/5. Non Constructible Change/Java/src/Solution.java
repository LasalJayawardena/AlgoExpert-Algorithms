import java.util.Arrays;

public class Solution {

    // O(nlog(n)) time | O(1) space O(n) space if we cannot mutate input data structure
    // Optimized Approach
    // Intuition -
    // Imagine we have a set of coin called U.
    // In this set we have now one coin and its value is 1: U = {1}.
    // Imagine we have another value called C, representing the change we can create with our coins: C = 1.
    // We have also V which represents the new coin we add to our set. If V > C + 1, we cannot make C + 1 change; if V <= C + 1, we can make from C to C + V change, and the minimum amount of change we cannot create is C + V + 1.
    public static int getNonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        int currentChangeCreated = 0;
        for(int coin: coins) {
            if (coin > currentChangeCreated + 1) {
                return currentChangeCreated + 1;
            }

            currentChangeCreated += coin;
        }

        return currentChangeCreated + 1;
    }

    public static void main(String[] args) {
        System.out.println(getNonConstructibleChange(new int[] {5, 7, 1, 1, 2, 3, 22})); // 20
        System.out.println(getNonConstructibleChange(new int[] {5})); // 1
        System.out.println(getNonConstructibleChange(new int[] {1, 2, 5})); // 4
    }
}

