class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val freqSet = mutableSetOf<Char>()

        for(c in sentence){
            freqSet.add(c)
        }
        return freqSet.size == 26 
    }
}