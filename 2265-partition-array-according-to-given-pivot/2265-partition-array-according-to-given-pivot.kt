class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val smallerList: MutableList<Int> = arrayListOf()
        val greaterList: MutableList<Int> = arrayListOf()
        var pivotCount = 0

        for (i in nums.indices) {
            if (nums[i] < pivot) {
                smallerList.add(nums[i])
            }else if (nums[i] > pivot) {
                greaterList.add(nums[i])
            }else pivotCount++
        }

        repeat(pivotCount){
            smallerList.add(pivot)
        }
        val mergedArray: IntArray = (smallerList + greaterList).toIntArray()

        return mergedArray
    }
}