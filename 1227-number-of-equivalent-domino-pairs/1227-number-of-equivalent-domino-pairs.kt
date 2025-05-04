class Solution {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val freqMap = HashMap<String, Int>()

        for(pair in dominoes){
            val key: String = if(pair[0] > pair[1]) "${pair[0]}${pair[1]}" else "${pair[1]}${pair[0]}"
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1)
            println(key)
        }
        var count = 0
        println(freqMap)
        for((key, value) in freqMap){
            if (value > 1) {
                count += (value * (value - 1)) / 2
            }
            
        }
        return count
    }
}