class Solution {
    fun reverseWords(s: String): String {
        val splitedStr = s.trim().replace(Regex("\\s+"), " ").split(" ").toMutableList()

        var r = splitedStr.size - 1
        var l = 0

        while(l < r){
            val temp = splitedStr[r]
            splitedStr[r] = splitedStr[l]
            splitedStr[l] = temp
            l++
            r--
        }
        return splitedStr.joinToString(" ")
    }
}