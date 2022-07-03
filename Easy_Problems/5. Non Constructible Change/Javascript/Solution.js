// O(nlog(n)) time | O(1) space O(n) space if we cannot mutate input data structure
// Optimized Approach
// Intuition -
// Imagine we have a set of coin called U. 
// In this set we have now one coin and its value is 1: U = {1}. 
// Imagine we have another value called C, representing the change we can create with our coins: C = 1. 
// We have also V which represents the new coin we add to our set. If V > C + 1, we cannot make C + 1 change; if V <= C + 1, we can make from C to C + V change, and the minimum amount of change we cannot create is C + V + 1.


function nonConstructibleChange(coins) {
    coins.sort((a, b) => a - b);

    let currentChangeCreated = 0;
    for (const coin of coins) {
        if (coin > currentChangeCreated + 1) {
            return currentChangeCreated + 1;
        }

        currentChangeCreated += coin;
    }

    return currentChangeCreated + 1;
}
