class Solution {
    fun hasSpecialSubstring(s: String, k: Int): Boolean {
        if(s.length == 1) return true

        for(i in 0..s.length - k){
            var isSatisfied = true
            for(j in i until i + k - 1){
                if(s[j] != s[j + 1]){
                    isSatisfied = false
                    break
                }
            }
            if(isSatisfied){
                val beforeValid = (i == 0) || (s[i - 1] != s[i])
                val afterValid = (i + k >= s.length) || (s[i + k] != s[i])

                if (beforeValid && afterValid) {
                    return true
                }
            } 
        }
        return false
    }
}