class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val freqMap = mutableMapOf<Int, Int>()

        for(num in arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1)
        }

        val seenFreqs = mutableSetOf<Int>()

        for (freq in freqMap.values) {
            if (!seenFreqs.add(freq)) {
                return false 
            }
        }

        return true
    }
}