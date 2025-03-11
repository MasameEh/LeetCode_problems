class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        
        for(i in 0 until k){
            var smallest = nums.min()
            var index = nums.indexOf(smallest) 

            nums[index] = smallest * multiplier
        }

        return nums
    }
}