class Solution {
    static boolean isVowel(char y) 
    { 
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U') 
            return true; 
        

        return false;
    } 
    public boolean halvesAreAlike(String s) {
        int len = s.length();

        int vowelsFirstHav = 0, vowelsSecHav = 0 ;

        for(int i = 0; i < len/2; i++){
            if(isVowel(s.charAt(i))){
                vowelsFirstHav++;
            }
        }

        for(int i = len/2; i < len; i++){
            if(isVowel(s.charAt(i))){
                vowelsSecHav++;
            }
        }

        return vowelsSecHav==vowelsFirstHav;
    }
}