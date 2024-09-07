class Solution {
    public String firstPalindrome(String[] words) {
        //StringBuilder rev = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            StringBuilder rev = new StringBuilder(words[i]);
            rev.reverse();
            if(rev.toString().equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}