class Solution {
    fun triangleType(nums: IntArray): String {
        val numsSet = nums.toSet()

        return when(numsSet.size){
            3 ->{
                if((nums[0] + nums[1]) > nums[2] 
                && (nums[1] + nums[2]) > nums[0]
                && (nums[0] + nums[2]) > nums[1]){
                    "scalene"
                }else "none"
            } 
            2 -> {
                if((nums[0] + nums[1]) > nums[2] 
                && (nums[1] + nums[2]) > nums[0]
                && (nums[0] + nums[2]) > nums[1]){
                    "isosceles"
                }else "none"
            } 
            1 -> "equilateral"
            else -> "none"
        }
    }
}