class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val squaredArr = nums.map { it * it }.toIntArray()

        for(i in 0 until squaredArr.size - 1){
            var isSwapped = false
            for(j in 0 until squaredArr.size - 1 - i){
                if(squaredArr[j] > squaredArr[j + 1]){
                    val temp = squaredArr[j]
                    squaredArr[j] =   squaredArr[j + 1]
                    squaredArr[j + 1] = temp
                    isSwapped = true
                }
            }
            if(!isSwapped){
                break
            }
        }
        return squaredArr
    }
}