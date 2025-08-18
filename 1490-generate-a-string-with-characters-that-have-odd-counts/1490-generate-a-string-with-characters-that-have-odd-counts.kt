class Solution {
    fun generateTheString(n: Int): String {
        return if(n % 2 != 0){
         "c".repeat(n)
        }else  "c".repeat(n - 1) + "d"
    }
}