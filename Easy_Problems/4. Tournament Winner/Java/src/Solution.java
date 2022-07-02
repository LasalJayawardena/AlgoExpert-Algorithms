import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String findTournamentWinner(String[][]competition_arr, int[]results_arr){
        final int HOME_TEAM_WON = 1;
        final int WIN_POINTS = 3;

        String currentBestTeam = "";
        String finalCurrentBestTeam = currentBestTeam;
        final Map<String, Integer> scores = new HashMap<>() {{
            put(finalCurrentBestTeam, 0);
        }};

        for (int i = 0; i < competition_arr.length; i++) {
        String homeTeam = competition_arr[i][0];
        String awayTeam = competition_arr[i][1];
        int result = results_arr[i];

        String winningTeam = result == HOME_TEAM_WON ? homeTeam : awayTeam;

        updateScores(scores, winningTeam, WIN_POINTS);

        if (scores.get(winningTeam) > scores.get(currentBestTeam)){
            currentBestTeam = winningTeam;
        }
    }

    return currentBestTeam;
    }

    public static void updateScores(Map<String, Integer> scores, String team, int points){
        if(scores.containsKey(team)){
            scores.put(team, scores.get(team) + points);
        } else {
            scores.put(team, points);
        }
    }

    public static void main(String[] args) {
        // Tests for findTournamentWinner
        String[][] competition_arr = {
                {"HTML", "C#"}, {"C#", "Python"}, {"Python", "HTML"}
        };
        int[] results_arr = {0, 0, 1};
        System.out.println(findTournamentWinner(competition_arr, results_arr)); // Python

        competition_arr = new String[][]{
                {"A", "B"},
        };

        results_arr = new int[]{1};
        System.out.println(findTournamentWinner(competition_arr, results_arr)); // A

        results_arr = new int[]{0};
        System.out.println(findTournamentWinner(competition_arr, results_arr)); // B

    }
}
