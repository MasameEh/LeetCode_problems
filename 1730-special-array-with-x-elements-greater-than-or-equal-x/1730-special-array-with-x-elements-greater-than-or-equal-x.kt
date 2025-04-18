class Solution {
    fun specialArray(nums: IntArray): Int {
        nums.sort()
        val n = nums.size

        for (i in 1..n) {
            var left = 0
            var right = n - 1
            var index = n

            while (left <= right) {
                val mid = left + (right - left) / 2
                if (nums[mid] >= i) {
                    index = mid
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }

            val count = n - index
            if (count == i) {
                return i
            }
        }

        return -1
    }
}