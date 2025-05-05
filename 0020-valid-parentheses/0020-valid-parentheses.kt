class Solution {
    fun isValid(s: String): Boolean {
        val stackS = mutableListOf<Char>()

        for(char in s){

            when(char){
                '(' ->  stackS.add(')')
                '[' ->  stackS.add(']')
                '{' -> stackS.add('}')
                else ->  
                    if(stackS.isNotEmpty()){
                        val poppedElement = stackS.removeLast()
                        if(poppedElement != char){
                            return false
                        }
                    }else return false 
            }

        }
        return stackS.isEmpty()
    }
}