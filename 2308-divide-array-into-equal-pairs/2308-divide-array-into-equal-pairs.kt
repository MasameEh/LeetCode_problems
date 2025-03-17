class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val freqMap = HashMap<Int, Int>()
        for(i in nums.indices){
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1)
        }

        for((key, value) in freqMap){
            if(value % 2 != 0){
                return false
            }
        }

        return true
    }
}