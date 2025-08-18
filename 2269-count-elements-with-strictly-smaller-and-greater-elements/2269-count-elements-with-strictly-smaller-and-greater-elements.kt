class Solution {
    fun countElements(nums: IntArray): Int {
        if (nums.size <= 2) return 0
        
        val sortedList = nums.sorted()
        var count = 0
        for(i in 1 until sortedList.size - 1){
            if(sortedList[0] != sortedList[i] && sortedList[sortedList.size - 1] != sortedList[i] ){
                count++
            }
        }
        return count
    }
}