class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0 
        for(i in nums.indices){
            for(j in i+1 until nums.size){
                if(abs(nums[i] - nums[j]) == k){
                    count++
                }
            }
        }
        return count
    }
}