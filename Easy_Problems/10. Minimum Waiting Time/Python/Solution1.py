# Greedy Approach
# Time Complexity: O(N · log(N)), where N is the number of queries
# Space Complexity: O(1)

def get_total_min_waiting_time(queries):
    queries.sort()
    total_waiting_time = 0
    next_waiting_time = 0
    
    for duration in queries:
        total_waiting_time += next_waiting_time
        next_waiting_time += duration
    
    return total_waiting_time