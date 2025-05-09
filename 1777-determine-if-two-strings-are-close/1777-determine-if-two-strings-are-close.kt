class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        if(word1.length != word2.length){
            return false
        }

        val freqMap1 = HashMap<Char, Int>()
        val freqMap2 = HashMap<Char, Int>()

        for(c in word1){
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1)
        }
        for(c in word2){
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1)
        }


            if (freqMap2.keys != freqMap1.keys) return false

            return freqMap2.values.sorted() == freqMap1.values.sorted()
    }
}