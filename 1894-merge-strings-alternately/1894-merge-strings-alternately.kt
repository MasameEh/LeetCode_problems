class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val length1 = word1.length
        val length2 = word2.length

        var i = 0
        var j = 0
        var mergedStr = ""
        while(i < length1 && j < length2){
            mergedStr += word1[i]
            mergedStr += word2[j]
            i++
            j++
        }
        if(j != length2){
            mergedStr += word2.substring(j, length2)
        }else{
            mergedStr += word1.substring(i, length1)
        }
        return mergedStr
    }
}