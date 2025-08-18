class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        if(s.length != goal.length) return false

        if (s == goal) {
            val set = mutableSetOf<Char>()
            for (c in s) {
                if (!set.add(c)) {
                    return true 
                }
            }
            return false 
        }
        val mismatches = mutableListOf<Int>()
        for (i in s.indices) {
            if (s[i] != goal[i]) {
                mismatches.add(i)
            }
        }

        return mismatches.size == 2 &&
           s[mismatches[0]] == goal[mismatches[1]] &&
           s[mismatches[1]] == goal[mismatches[0]]
    } 
}