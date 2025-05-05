class Solution {
    fun isValid(s: String): Boolean {
        val stackS = mutableListOf<Char>()

        for(char in s){
            if(char == '(' ){
                stackS.add(')')
            }else if(char == '['){
                stackS.add(']')
            }else if(char == '{'){
                stackS.add('}')
            }else {
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