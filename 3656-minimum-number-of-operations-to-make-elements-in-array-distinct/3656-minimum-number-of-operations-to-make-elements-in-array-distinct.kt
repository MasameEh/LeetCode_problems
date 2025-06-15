class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val set = nums.toSet()
        if(set.size == nums.size) return 0

        var ans = 0

        for(i in nums.indices step 3){
            if(checkUnique(nums, i)){
                return ans
            }else ans++
        }
        return ans
    }

    private fun checkUnique(nums: IntArray, start: Int): Boolean{
        val trackingSet = hashSetOf<Int>()

        for(i in start until nums.size){
            if(trackingSet.contains(nums[i])){
                return false
            }
            trackingSet.add(nums[i])
        }
        return true
    }
}