class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var j = 0
        if(n == 0){return}

        for(i in m..n + m - 1){
            nums1[i] = nums2[j++]
        }
        nums1.sort()
    }
}