class Solution {
    private boolean isPrefixAndSuffix(String a, String b){
        boolean isPrefix = false;
        boolean isSuffix = false;
        int lenA = a.length();
        int lenB = b.length(); 

        if(b.substring(0, lenA).equals(a)){
            isPrefix = true;
            System.out.println("isPrefix " + isPrefix);
        }

        if(b.substring(lenB - lenA, lenB).equals(a)){
            isSuffix = true;
            System.out.println("isSuffix " + isSuffix);
        }

        return isSuffix && isPrefix;
        
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for(int  i = 0; i < words.length - 1; i++){
            for(int  j = i+1; j < words.length; j++){
                if(words[i].length() <= words[j].length()){
                    if(isPrefixAndSuffix(words[i], words[j])){
                        count++;
                    } 
                }
                
            }
        }
        return count;
    }
}