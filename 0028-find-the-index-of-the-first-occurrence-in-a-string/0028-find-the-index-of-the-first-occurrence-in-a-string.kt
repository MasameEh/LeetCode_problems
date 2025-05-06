class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val nLength = needle.length

        for(i in 0..haystack.length - nLength){
            
            val strSegment =  haystack.substring(i, i + nLength)
            if(strSegment == needle){
                return i
            }
        }

        return -1
    }
}