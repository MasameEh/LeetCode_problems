class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var minW = Int.MAX_VALUE

        for(i in 0..blocks.length - k){
            var wCount = 0
            for(j in i..i + k-1){
                if (blocks[j] == 'W') {
                    wCount++
                }
            }
            minW = minOf(minW, wCount)
        }
        return minW;
    }
}