class Solution {
    fun calPoints(operations: Array<String>): Int {

        val ansList = mutableListOf<Int>()

        for(i in 0 until operations.size ){
            if(operations[i].toIntOrNull() != null){
                ansList.add(operations[i].toIntOrNull()!!)
            }else{
                when(operations[i]){
                    "D" ->{ 
                            val doubled = ansList.last() * 2
                            ansList.add(doubled) 
                        }
                    "C" ->{
                        ansList.removeLast()
                    } 
                    "+" ->{
                        val secondToLast = ansList.getOrNull(ansList.size - 2) ?: 0
                        ansList.add(secondToLast + ansList.last())
                    } 
                }   
            }
        }
        return ansList.sum()
    }
}