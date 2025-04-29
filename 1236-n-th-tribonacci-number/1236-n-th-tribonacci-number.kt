class Solution {
    fun tribonacci(n: Int): Int {
        if(n == 0){
            return 0
        }
        if(n == 1 || n == 2){
            return 1
        }
        var a = 0  
        var b = 1  
        var c = 1 
        var result = 0

        for(i in 3..n){
            result = c + a + b
            a = b
            b = c
            c = result
        }

        return  result
    }
}