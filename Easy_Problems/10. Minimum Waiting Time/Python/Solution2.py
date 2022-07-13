# Greedy Approach + Improved Logic
# Intuition is that all remaining queries are waiting for the current query to finish, therefore need to add n times where n is the number of queries remaining
# Time Complexity: O(N · log(N)), where N is the number of queries
# Space Complexity: O(1)

def get_total_min_waiting_time(queries):
    queries.sort()

    total_waiting_time = 0
    
    for idx, duretion in enumerate(queries):
        queries_left = len(queries) - (idx + 1)
        total_waiting_time += queries_left * duretion

    return total_waiting_time

