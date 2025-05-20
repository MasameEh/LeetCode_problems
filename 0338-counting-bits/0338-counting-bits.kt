class Solution {

    fun countOnes(n: Int): Int {
        var count = 0
        var num = n

        while (num > 0) {
            num = num and (num - 1)
            count++
        }

        return count
    }

    fun countBits(n: Int): IntArray {
        val resArr = IntArray(n + 1){0}

        for(i in 0..n){
            val result = countOnes(i)
            resArr[i] = result
        }

        return resArr
    }
}