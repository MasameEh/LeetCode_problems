class Solution {
    fun reverseVowels(s: String): String {
        var vowelsList = mutableListOf<Char>()

        for(c in s){
            if( c.lowercaseChar() == 'a' ||
                c.lowercaseChar() == 'e' ||
                c.lowercaseChar() == 'i' ||
                c.lowercaseChar() == 'o' ||
                c.lowercaseChar() == 'u' ){

                vowelsList.add(c)   
            }   
        }

        vowelsList.reverse()
        var reversedStr = ""
        
        for(c in s){
            if(c.lowercaseChar() == 'a' ||
                c.lowercaseChar() == 'e' ||
                c.lowercaseChar() == 'i' ||
                c.lowercaseChar() == 'o' ||
                c.lowercaseChar() == 'u' ){

                reversedStr += vowelsList[0] 
                vowelsList.removeFirst()
            }else{
                reversedStr += c 
            }
        }
        return reversedStr
    }
}