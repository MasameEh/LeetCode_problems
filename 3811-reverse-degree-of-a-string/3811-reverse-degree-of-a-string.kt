class Solution {
    fun reverseDegree(s: String): Int {
        val abc = ('a'..'z').joinToString("")
        val revAlphabet = abc.reversed()
        var sum = 0

        for(i in 0 until s.length){
            sum += ((revAlphabet.indexOf(s[i])+1) * (i+1))
        }

        return sum
    }
}