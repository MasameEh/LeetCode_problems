class Solution {
    fun transformArray(nums: IntArray): IntArray {

        for(i in nums.indices){
            if(nums[i] % 2 == 0) nums[i] = 0 else nums[i] = 1
        }
        return nums.sortedArray()
    }
}