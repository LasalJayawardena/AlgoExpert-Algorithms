# O(n) time | O(k) space where k is the number of teams
# Hash Map Approach + One Pass Approach

def findTournamentWinner(competition_arr, results_arr):

    HOME_TEAM_WON = 1;
    WIN_POINTS = 3;
    
    current_best_team = "";
    scores = {current_best_team: 0}

    for idx, competition in enumerate(competition_arr):
        [home_team, away_team] = competition
        result = results_arr[idx]

        winningTeam = home_team if result == HOME_TEAM_WON else away_team
        updateScores(scores, winningTeam, WIN_POINTS)

        if scores[winningTeam] > scores[current_best_team]:
            current_best_team = winningTeam
    
    return current_best_team

def updateScores(scores, team, points):
    if team not in scores:
        scores[team] = 0
    scores[team] += points

# Tests for findTournamentWinner
assert(findTournamentWinner([["A", "B"]], [1]) == "A")
assert(findTournamentWinner([["A", "B"]], [0]) == "B")
assert(findTournamentWinner([["HTML", "C#"], ["C#", "Python"], ["Python", "HTML"]], [0,0,1]) == "Python")
