class Solution {
    fun balancedStringSplit(s: String): Int {
        var countR = 0
        var countL = 0
        var countBalanced = 0
    
        for(char in s){
            if(char == 'R'){
                countR++
            }else countL++

            if(countR == countL){
                countBalanced++
                countR = 0
                countL = 0
            }
        }
        return countBalanced
    }
}