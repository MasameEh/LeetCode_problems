class Solution {
    fun findNumbers(nums: IntArray): Int {

        var evenCounts = 0

        for(num in nums) {
            var numberCount = 0
            var currNumber = num

            while(currNumber > 0) {
                numberCount++
                currNumber /= 10
            }
            if(numberCount % 2 == 0) evenCounts++
        }

        return evenCounts
    }
}