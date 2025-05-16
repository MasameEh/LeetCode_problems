class Solution {
    fun sortColors(nums: IntArray): Unit {

        for(i in 0..nums.size - 1) {
            var isSorted = true
            for(j in 1..nums.size - i - 1) {
                if(nums[j - 1] > nums[j]) {
                    var temp = nums[j]
                    nums[j] = nums[j - 1]
                    nums[j - 1] = temp
                    isSorted = false
                }
            } 
            if(isSorted) return
        }
    }
}