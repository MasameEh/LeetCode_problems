class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var oddCount = 0

        for(i in arr.indices){
            if(oddCount == 3) return true
            if(arr[i] % 2 != 0){
                oddCount++
            }else oddCount = 0
        }
        return if(oddCount == 3) true else false
    }
}