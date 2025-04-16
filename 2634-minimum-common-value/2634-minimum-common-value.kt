class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {

        for(i in nums1.indices){
            val min = nums1[i]
            var left = 0
            var right = nums2.size - 1

            while(left <= right){
                var mid = left + (right - left) / 2
                if(nums2[mid] == min){
                    return min
                }else if(min > nums2[mid]){
                    left = mid + 1
                }else right = mid - 1
            }
        }
        return -1
    }
}