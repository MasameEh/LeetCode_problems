class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val unqiueElements = nums.toSet()
        return if(unqiueElements.contains(0)) unqiueElements.size - 1 else unqiueElements.size
    }
}