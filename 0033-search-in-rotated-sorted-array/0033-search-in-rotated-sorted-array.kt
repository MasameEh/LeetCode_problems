class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var right = nums.size -1
        var left = 0

        while(right >= left){
            var mid = left + (right - left) / 2

            if(nums[mid] == target){
                return mid
            }else if (nums[mid] >= nums[left]){
                if(nums[mid] > target && nums[left] <= target){
                    right = mid - 1
                }else{
                    left = mid + 1 
                }
            }else{
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1
                }else{
                    right = mid - 1 
                }
            }
        }

        return -1
    }
}