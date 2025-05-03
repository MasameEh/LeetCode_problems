class Solution {
    fun isPalindrome(s: String): Boolean {
        var str : String = ""
        for(c in s){
            if(c.isLetterOrDigit()){
                str += c
            }
        }
        str = str.lowercase()
        return str.reversed().equals(str)
    }
}