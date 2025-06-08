class Solution {
    fun countKeyChanges(s: String): Int {
        val lowerCase = s.lowercase()
        var count = 0

        for(i in 1 until lowerCase.length){
            if(lowerCase[i] != lowerCase[i - 1]){
                count++
            }
        }
        return count
    }
}