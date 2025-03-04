class Solution {
    fun checkPowersOfThree(n: Int): Boolean {
        var num = n
        while (num > 0) {
            val rem = num % 3
            if (rem == 2) return false
            num /= 3
        }
        return true
    }
}