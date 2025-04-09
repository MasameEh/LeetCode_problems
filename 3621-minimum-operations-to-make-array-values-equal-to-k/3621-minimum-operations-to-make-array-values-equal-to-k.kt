class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val uniqueElements  = nums.toSet()
        var count = 0

        for (num in uniqueElements) {
            if (num > k) {
                count++
            }else if(num < k){
                return -1
            }
        }
        return count
    }
}