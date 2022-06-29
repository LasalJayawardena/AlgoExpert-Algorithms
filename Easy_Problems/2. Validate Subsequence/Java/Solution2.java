import java.util.Scanner;

class Solution1{

    // O(n) time | O(1) space
    // Pointers with For Loop
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for (var value : array) {
            if (seqIdx == sequence.size()) {
                break;
            }
            if (sequence.get(seqIdx) == value) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }



}