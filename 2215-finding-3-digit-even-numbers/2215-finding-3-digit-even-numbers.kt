class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val ans = mutableSetOf<Int>() 

        for(i in digits.indices){
            for(j in 0..digits.size - 1){
                if(j == i){
                    continue
                }
                for(k in 0..digits.size - 1){
                    if (k == i || k == j) continue

                    val d1 = digits[i]
                    val d2 = digits[j]
                    val d3 = digits[k]

                    if (d1 == 0) continue 
                    if (d3 % 2 != 0) continue 

                    val num = d1 * 100 + d2 * 10 + d3
                    if(num % 2 == 0){
                        ans.add(num)
                    }
                }
            }
        }
        return ans.sorted().toIntArray()
    }
}