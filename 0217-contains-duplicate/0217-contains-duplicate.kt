class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsSet = mutableSetOf<Int>()

        for(i in nums.indices){
            if(numsSet.contains(nums[i])){
                return true
            }else{
                numsSet.add(nums[i])
            }
        }
        return false
    }
}