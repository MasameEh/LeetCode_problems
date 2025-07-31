class Solution {
    fun countOnes(n: Int): Int{
        var i = 0
        var num = n
        while(num > 0){
            num = num.and(num - 1)
            i++
        }
        return i
    }

    fun sortByBits(arr: IntArray): IntArray {
        
        for(i in 0 until arr.size - 1){
            for(j in 0 until arr.size - i- 1){
                val n1 = countOnes(arr[j])
                val n2 = countOnes(arr[j + 1])

                if(n1 > n2){
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }else if(n1 == n2){
                    if(arr[j] >  arr[j + 1]){
                        val temp = arr[j]
                        arr[j] = arr[j + 1]
                        arr[j + 1] = temp
                    }
                }
            }
        }
        return arr
    }
}