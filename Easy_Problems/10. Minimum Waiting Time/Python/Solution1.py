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

# Tests for get_total_min_waiting_time
assert(get_total_min_waiting_time([3, 2, 1, 2, 6]) == 17)
assert(get_total_min_waiting_time([10]) == 0)
assert(get_total_min_waiting_time([1, 10]) == 1)