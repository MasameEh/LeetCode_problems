class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        if(s.length != words.size) return false

        for(i in 0 until words.size){
            if(words[i][0] != s[i]){
                return false
            }
       }
       return true
    }
}