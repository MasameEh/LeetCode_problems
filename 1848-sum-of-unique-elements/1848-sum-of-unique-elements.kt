class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        val freqMap = hashMapOf<Int, Int>()

        for(num in nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1)
        }

        var sum = 0
        for((key, value) in freqMap){
            if(value == 1) sum += key
        }

        return sum
    }
}