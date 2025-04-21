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

        val reversedVowels = vowelsList.reversed()
        var reversedStr = ""
        var i = 0
        for(c in s){
            if(c.lowercaseChar() == 'a' ||
                c.lowercaseChar() == 'e' ||
                c.lowercaseChar() == 'i' ||
                c.lowercaseChar() == 'o' ||
                c.lowercaseChar() == 'u' ){

                reversedStr += reversedVowels[i++] 
            }else{
                reversedStr += c 
            }
        }
        return reversedStr
    }
}