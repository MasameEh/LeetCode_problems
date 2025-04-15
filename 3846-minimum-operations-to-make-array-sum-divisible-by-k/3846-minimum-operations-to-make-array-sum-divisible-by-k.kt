class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.sumOf{it} % k
    }
}