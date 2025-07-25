class Solution {
    fun maxSum(nums: IntArray): Int {
        if(nums.max() < 0){
            return nums.max()
        }
        val uniqueNums = nums.toSet()
        var sum = 0
        
        for(num in uniqueNums){
            if(num > 0) sum += num
        }
        return sum
    }
}