class Solution {
    private boolean isPrefix(String a, String b){
        boolean isPrefix = false;
        int lenA = a.length();
        int lenB = b.length(); 

        if(b.substring(0, lenA).equals(a)){
            isPrefix = true;
            
        }

        return isPrefix; 
    }
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for(int  i = 0; i < words.length; i++){
            if(words[i].length() >= pref.length() && isPrefix(pref, words[i])){
                count++;
            }
        }
        return count;
    }
}