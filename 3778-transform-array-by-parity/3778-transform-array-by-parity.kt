class Solution {
    fun transformArray(nums: IntArray): IntArray {
        return nums.map { if (it % 2 == 0) 0 else 1 }.sorted().toIntArray()
    }
}