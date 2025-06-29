class Solution {
    fun arraySign(nums: IntArray): Int {
        var negativeCount = 0
        for (num in nums) {
            if (num == 0) return 0  
            if (num < 0) negativeCount++
        }
        return if (negativeCount % 2 == 0) 1 else -1
    }
}