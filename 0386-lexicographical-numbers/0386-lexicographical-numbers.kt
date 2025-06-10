class Solution {
    fun lexicalOrder(n: Int): List<Int> {
        val numbers = mutableListOf<Int>()
        for(i in 1..n){
            numbers.add(i)
        }

        return numbers.map{ it.toString()}.sorted().map{it.toInt()}
    }
}