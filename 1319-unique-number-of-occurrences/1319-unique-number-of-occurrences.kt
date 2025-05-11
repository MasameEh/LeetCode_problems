class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val freqMap = mutableMapOf<Int, Int>()

        for(num in arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1)
        }

        val freqSet = freqMap.values.toSet()

        return arr.toSet().size == freqSet.size
    }
}