class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n1 = str1.length(); 
        int n2 = str2.length();
        if(n2 > n1) return false;

        int j = 0;

        for(int i = 0; i < n1 && j < n2; i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            if (c1 == c2 || (c1 == 'z' ? 'a' : (char)(c1 + 1)) == c2) {
                j++; // Move to the next character in str2
            }
        }
        
        return j == n2; 
    }
}