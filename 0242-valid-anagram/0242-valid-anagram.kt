class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sLen = s.length
        val tLen = t.length

        if(sLen != tLen) {
            return false
        }

        val sFreqMap = mutableMapOf<Char, Int>()
        val tFreqMap = mutableMapOf<Char, Int>()

        for(i in 0..s.length - 1){
            sFreqMap.put(s[i], sFreqMap.getOrDefault(s[i], 0) + 1)
            tFreqMap.put(t[i], tFreqMap.getOrDefault(t[i], 0) + 1)
        }

        for((key, value) in sFreqMap){
            if(tFreqMap.contains(key)){
                if(value != tFreqMap[key]){
                    return false
                }
            }else return false
        }
        return true
    }
}