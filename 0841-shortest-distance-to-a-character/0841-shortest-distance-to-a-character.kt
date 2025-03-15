class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val res = IntArray(s.length)
        val freqIndices = mutableListOf<Int>()

        for (i in 0..s.length - 1) {
            if(s[i] == c){
                freqIndices.add(i)
            }
        }
        println(freqIndices)
        for (i in 0..s.length - 1) {
            var min = Int.MAX_VALUE
            for (j in freqIndices.indices){
               min = minOf(abs(i - freqIndices[j]), min)
            }
            res[i] = min
        }

        return res
    }
}