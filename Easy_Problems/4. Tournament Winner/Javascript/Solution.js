// O(n) time | O(k) space where k is the number of teams
// Hash Map Approach + One Pass Approach

const HOME_TEAM_WON = 1;
const POINTS = 3;

function findTournamentWinner(competition_arr, results_arr) {
    let currBestTeam = "";
    const scores = { [currBestTeam]: 0 };

    for (let i = 0; i < competition_arr.length; i++) {
        const [homeTeam, awayTeam] = competition_arr[i];
        const result = result_arr[i];

        const winningTeam = result === HOME_TEAM_WON ? homeTeam : awayTeam;

        updateScores(scores, winningTeam);

        if (scores[winningTeam] > scores[currBestTeam]) {
            currBestTeam = winningTeam;
        }
    }

    return currBestTeam;
}

function updateScores(scores, team) {
    const prevScore = scores[team] || 0;
    scores[team] = prevScore + POINTS;
}
