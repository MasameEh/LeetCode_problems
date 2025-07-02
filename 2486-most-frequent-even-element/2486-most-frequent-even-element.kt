class Solution {
    fun mostFrequentEven(nums: IntArray): Int {
        val freqMap = sortedMapOf<Int, Int>()
        nums.filter { it % 2 == 0 }.forEach{
            freqMap.set(it, freqMap.getOrDefault(it, 0) + 1)
        }
        var maxx = 0
        var ans = -1 
        for((key, value) in freqMap){
            if(value > maxx){
                maxx = value
                ans = key
            }
        }
        return ans
    }
}