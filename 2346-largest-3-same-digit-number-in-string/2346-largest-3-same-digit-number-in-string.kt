class Solution {
    fun largestGoodInteger(num: String): String {
        
        var subStrLen = 1
        var maxNum = ""

        for(i in 1 until num.length){
            if(num[i] == num[i - 1]){
                subStrLen++
            }else{
               subStrLen = 1 
            }
            if(subStrLen == 3){
                if(maxNum.isEmpty() || maxNum.toInt() <  num[i].digitToInt()){
                    maxNum = num[i].toString()
                } 
            }
        }

        return maxNum.repeat(3)
    }
}