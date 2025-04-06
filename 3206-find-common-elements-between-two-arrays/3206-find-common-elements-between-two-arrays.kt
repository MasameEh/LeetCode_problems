class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val freqMap1 = HashMap<Int, Int>()
        val freqMap2 = HashMap<Int, Int>()    

        val res = IntArray(2)

        for(i in nums1.indices){
            freqMap1.put(nums1[i], freqMap1.getOrDefault(nums1[i], 0) + 1)
        }
        for(i in nums2.indices){
            freqMap2.put(nums2[i], freqMap2.getOrDefault(nums2[i], 0) + 1)
        }


        for((key1, value) in freqMap1){
            for((key2) in freqMap2){
                if(key1 == key2){
                    res[0] += value
                }
            }
        }

        for((key1, value) in freqMap2){
            for((key2) in freqMap1){
                if(key1 == key2){
                    res[1] += value
                }
            }
        }

        return res
    }
}