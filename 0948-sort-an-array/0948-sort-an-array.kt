class Solution {
    fun sortArray(nums: IntArray): IntArray {
        val max = nums.max()
        val min = nums.min()
        val offset = 0 - min 
        val countArray = IntArray(offset + max + 1)

        for(i in nums.indices){
            countArray[nums[i] + offset] += 1
        }
        
        for(i in 1..countArray.size - 1){
            countArray[i] += countArray[i - 1]
        }
        val sortedArr = IntArray(nums.size)

        for(i in nums.indices){
            val index = countArray[nums[i] + offset] - 1
            sortedArr[index] = nums[i]
            countArray[nums[i] + offset]--
        }
        return sortedArr

    }
}