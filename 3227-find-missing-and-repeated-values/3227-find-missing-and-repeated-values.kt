class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size * grid.size
        val result = IntArray(2)
        val count = IntArray(n + 1)
        
        for(row in grid){
            for(num in row){
                count[num]++
            }
        }

        for(i in 1..n){
            when(count[i]){
                2 -> result[0] = i 
                0 -> result[1] = i
            }
        }

        return result
    }
}