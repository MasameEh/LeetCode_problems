class Solution {
    public char findTheDifference(String s, String t) {
        int[] freqArr1 = new int[26];
        int[] freqArr2 = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            freqArr1[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++)
        {
            freqArr2[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++)
        {
            if(freqArr1[i] != freqArr2[i]){
                return (char)(i + 'a');
            }
        }
    
        return 'a';
    }
}