class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean isSubsequence = false;
        int next = 0;
        if(s.isEmpty()) return true;

        for(int i = 0; i < s.length(); i++){
            char subChar = s.charAt(i);
            isSubsequence = false;
            
            for(int j = next; j < t.length(); j++){
                if(t.charAt(j) == subChar){
                    isSubsequence = true;
                    next = j + 1;
                    break;
                }
            }
            if(!isSubsequence) break;
        }
        return isSubsequence;
    }
}