class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val sLength = s.length
        val tLength = t.length

        if(tLength < sLength){
            return false
        }
        var startIndex = 0
        for (i in 0..sLength - 1) {
            var isFound = false

            for (j in startIndex..tLength - 1) {

                if(s[i] == t[j]) {
                    startIndex = j + 1
                    isFound = true
                    break;
                }
            }
            if(!isFound){
                return false
            }
        }

        return true
    }
}