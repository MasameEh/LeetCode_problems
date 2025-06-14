class Solution {
    fun toLowerCase(s: String): String {
        var ans = ""
        for(c in s){
            if(c in 'A'..'Z'){
                ans += c + 32
            }else ans += c
            
        }
        return ans
    }
}