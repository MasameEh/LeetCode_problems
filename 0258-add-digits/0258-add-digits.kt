class Solution {
    fun addDigits(num: Int): Int {
        var n = num

        while(n > 9){
            var res = 0
            while(n > 0){
                val temp = n % 10
                res += temp
                n /= 10
            }
            n = res
        }

        return n
    }
}